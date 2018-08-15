package com.greenfurniture.onlineorder.security.jwt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class TokenProvider {

	private static final Logger LOG = LoggerFactory.getLogger(TokenProvider.class);
	private static final String AUTHORITIES_KEY = "auth";
	private String secretKey;
	private long tokenValidityInMilliseconds;
	private long tokenValidityInMillisecondsForRememberMe;

	@PostConstruct
	public void init() {
		this.secretKey = "TheQuickBrownFoxJumpsOverTheLazyDog";
		this.tokenValidityInMilliseconds = 1000 * 1000;
		this.tokenValidityInMillisecondsForRememberMe = 1000 * 1000 * 1000;
	}

	public String createToken(Authentication authentication, Boolean rememberMe) {
		String authorities = authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority)
				.collect(Collectors.joining(","));

		long now = (new Date()).getTime();
		Date validity;
		if (rememberMe) {
			validity = new Date(now + this.tokenValidityInMillisecondsForRememberMe);
		} else {
			validity = new Date(now + this.tokenValidityInMilliseconds);
		}

		return Jwts.builder().setSubject(authentication.getName()).claim(AUTHORITIES_KEY, authorities)
				.signWith(SignatureAlgorithm.HS512, secretKey).setExpiration(validity).compact();
	}

	public Authentication getAuthentication(String token) {
		Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();

		Collection<? extends GrantedAuthority> authorities = Arrays
				.stream(claims.get(AUTHORITIES_KEY).toString().split(",")).map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());

		User principal = new User(claims.getSubject(), "", authorities);

		return new UsernamePasswordAuthenticationToken(principal, token, authorities);
	}

	public boolean validateToken(String authToken) {
		try {
			Jwts.parser().setSigningKey(secretKey).parseClaimsJws(authToken);
			return true;
		} catch (SignatureException e) {
			LOG.info("Invalid JWT signature.");
			LOG.trace("Invalid JWT signature trace: {}", e);
		} catch (MalformedJwtException e) {
			LOG.info("Invalid JWT token.");
			LOG.trace("Invalid JWT token trace: {}", e);
		} catch (ExpiredJwtException e) {
			LOG.info("Expired JWT token.");
			LOG.trace("Expired JWT token trace: {}", e);
		} catch (UnsupportedJwtException e) {
			LOG.info("Unsupported JWT token.");
			LOG.trace("Unsupported JWT token trace: {}", e);
		} catch (IllegalArgumentException e) {
			LOG.info("JWT token compact of handler are invalid.");
			LOG.trace("JWT token compact of handler are invalid trace: {}", e);
		}
		return false;
	}
}

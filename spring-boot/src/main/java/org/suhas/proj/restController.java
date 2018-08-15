package org.suhas.proj;


import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class restController {
	
	@GetMapping(value="/init",produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> init()
	{
		return new ResponseEntity<String>("hello Suhas from rest",HttpStatus.OK);
	}
}

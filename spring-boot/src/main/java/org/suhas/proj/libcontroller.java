package org.suhas.proj;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class libcontroller {
	
	Map<Integer,book> l=library.lib;
	@GetMapping(value="/books",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<Integer,book>> get()
	{
		return new ResponseEntity<Map<Integer,book>>(l, HttpStatus.OK);
	}
	
	@GetMapping(value="/books/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<book> getone(@PathVariable int id)
	{
		return new ResponseEntity<book>(l.get(id), HttpStatus.OK);
	}
	
	@PostMapping(value="/books",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> postone(@RequestBody(required=true) book buk)
	{
		l.put(buk.id,buk);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping(value="/books",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateone(@RequestBody(required=true) book buk)
	{
		if(l.containsKey(buk.getId()))l.replace(buk.getId(),buk);
		else return postone(buk);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/books{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateone(@PathVariable int i)
	{
		if(l.containsKey(i))l.remove(i);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}

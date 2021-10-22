package com.mphasis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

	
	@GetMapping("/getMsg")
	public ResponseEntity<String> getMsg(){
		return new ResponseEntity<String>("Good morning",HttpStatus.OK);
	} 
}

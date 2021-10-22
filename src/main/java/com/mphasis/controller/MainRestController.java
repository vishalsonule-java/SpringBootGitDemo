package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.service.MsgService;

@RestController
public class MainRestController {
	
	@Autowired
	private MsgService service;

	
	@GetMapping("/getMsg")
	public ResponseEntity<String> getMsg(){
		return new ResponseEntity<String>(service.generateMsg(),HttpStatus.OK);
	} 
}

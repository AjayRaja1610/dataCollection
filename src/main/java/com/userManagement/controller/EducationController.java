package com.userManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userManagement.binding.EducationBinding;
import com.userManagement.service.DCService;

@RestController
public class EducationController {
	
	@Autowired
	private DCService service;
	
	@PostMapping("/saveEducation")
	public ResponseEntity<Long> saveEducation(@RequestBody EducationBinding eduBinding){
		Long caseNum = service.saveEducation(eduBinding);
		return new ResponseEntity<> (caseNum, HttpStatus.CREATED);
		
	}

}

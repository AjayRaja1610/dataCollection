package com.userManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userManagement.binding.ChildRequestBinding;
import com.userManagement.binding.Summary;
import com.userManagement.service.DCService;

@RestController
public class ChildController {
	
	@Autowired
	private DCService service;
	
	@PostMapping("/saveChildren")
	public ResponseEntity<Summary> saveChildren(@RequestBody ChildRequestBinding request){
		Long caseNum = service.saveChildrenData(request);
		Summary summary = service.getSummary(caseNum);
		return new ResponseEntity<> (summary, HttpStatus.CREATED);
	}

}

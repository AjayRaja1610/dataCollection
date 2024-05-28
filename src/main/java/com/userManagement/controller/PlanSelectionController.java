package com.userManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userManagement.binding.PlanSelectionBinding;
import com.userManagement.service.DCService;

@RestController
public class PlanSelectionController {
	
	@Autowired
	private DCService service;
	
	@PostMapping("/planSelection")
	public ResponseEntity<Long> selectPlan(@RequestBody PlanSelectionBinding planSelectionBinding){
		Long caseNum = service.savePlanSelection(planSelectionBinding);
		return new ResponseEntity<> (caseNum, HttpStatus.CREATED);
		
	}

}

package com.userManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="DC_CASES")
public class DcCaseEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CaseNum;
	
	private Integer appId;
	
	private Integer planId;
	

}

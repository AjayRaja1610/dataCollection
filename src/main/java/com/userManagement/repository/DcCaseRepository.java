package com.userManagement.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.userManagement.entity.DcCaseEntity;

public interface DcCaseRepository extends JpaRepository<DcCaseEntity, Serializable>{
	

}

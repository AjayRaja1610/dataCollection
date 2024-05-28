package com.userManagement.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userManagement.entity.ChildrenEntity;
import java.util.List;


public interface ChildRepositroy extends JpaRepository<ChildrenEntity, Serializable> {
	
	public List<ChildrenEntity> findByCaseNum(Long caseNum);

}

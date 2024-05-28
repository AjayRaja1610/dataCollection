package com.userManagement.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userManagement.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity, Serializable>{

}

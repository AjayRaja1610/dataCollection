package com.userManagement.service;

import java.util.Map;

import com.userManagement.binding.ChildRequestBinding;
import com.userManagement.binding.EducationBinding;
import com.userManagement.binding.IncomeBinding;
import com.userManagement.binding.PlanSelectionBinding;
import com.userManagement.binding.Summary;

public interface DCService {
	
   public Long loadCaseNum(Integer appId);
	
	public Map<Integer, String> getPlanNames();
	
	public Long savePlanSelection (PlanSelectionBinding planSelectionBinding);
	
	public Long saveIncomeData(IncomeBinding incomeBinding);
	
	public Long saveEducation(EducationBinding endBinding);
	
	public Long saveChildrenData(ChildRequestBinding childRequestBinding);
	
	public Summary getSummary(Long CaseNum);

}

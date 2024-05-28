package com.userManagement.binding;

import java.util.List;

import lombok.Data;

@Data
public class ChildRequestBinding {
	
    private Long CaseNum;
	
	private List<ChildBinding> childs;

}

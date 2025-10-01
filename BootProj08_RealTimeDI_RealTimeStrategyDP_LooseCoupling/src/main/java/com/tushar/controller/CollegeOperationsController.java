package com.tushar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tushar.model.Employee;
import com.tushar.service.iEmployeeMgmtService;

@Controller("clgOperation")
public class CollegeOperationsController {
	
	@Autowired
	private iEmployeeMgmtService empService;
	
	public List<Employee> showEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception{
		//use service
		List<Employee> list = empService.fetchEmployeeByDesg(desg1, desg1, desg3);
		return list;
	}

}

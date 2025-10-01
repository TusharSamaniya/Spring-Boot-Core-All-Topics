package com.tushar.service;

import java.util.List;

import com.tushar.model.Employee;

public interface iEmployeeMgmtService {
	
	public List<Employee> fetchEmployeeByDesg(String desg1,String desg12, String desg3) throws Exception;

}

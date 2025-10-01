package com.tushar.dao;

import java.util.List;

import com.tushar.model.Employee;

public interface iEmployeeDAO {
	
	public List<Employee> getEmpsByDesg(String desg1, String desg2, String desg3) throws Exception;

}

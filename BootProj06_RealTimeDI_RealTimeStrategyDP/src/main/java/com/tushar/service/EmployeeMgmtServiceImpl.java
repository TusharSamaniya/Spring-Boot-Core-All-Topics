package com.tushar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tushar.dao.iEmployeeDAO;
import com.tushar.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements iEmployeeMgmtService {
	
	@Autowired
	private iEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg12, String desg3) throws Exception {
		// use dao
		List<Employee> list = empDAO.getEmpsByDesg(desg1, desg12, desg3);
		return list;
	}

}

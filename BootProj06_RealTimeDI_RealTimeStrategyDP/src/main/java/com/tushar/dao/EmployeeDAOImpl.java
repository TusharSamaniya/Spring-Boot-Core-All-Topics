package com.tushar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tushar.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements iEmployeeDAO {
	
	private static final String query= "select empno,ename,job,sal,deptno from emp where job in(?,?,?) order by job";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmpsByDesg(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list = null;
		try(Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement(query)){
			
			//set values to query param
			psmt.setString(1, desg1);
			psmt.setString(2, desg2);
			psmt.setString(3, desg3);
			
			//execute the query and copy the resultSet obj to List<Employee> object
			try(ResultSet rs = psmt.executeQuery()){
				list = new ArrayList<Employee>();
				while(rs.next()) {
					//copy each recored to employee class obj
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					//add each employee class object to list collection
					list.add(emp);
				}
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}

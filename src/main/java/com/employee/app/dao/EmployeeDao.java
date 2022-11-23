package com.employee.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.employee.app.entity.Employee;

public interface EmployeeDao {
	
	//CRUD
	
	Boolean addEmployee(Employee newEmployee)throws SQLException;
	Employee getEmployee(Integer employeeId);
	Boolean updateEmployee(Employee updateEmployee);// update all attributes except id
	Boolean updateEmployeeName(Integer employeeId,String name);
	Boolean deleteEmployee(Integer employeeId);
	List<Employee> getAllEmployees();
	Boolean updateEmployeeSalary(Integer employeeId,String name);
	
}

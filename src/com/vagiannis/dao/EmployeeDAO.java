package com.vagiannis.dao;

import java.util.List;

import com.vagiannis.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployees(int theId);

	public void deleteEmployee(int theId);





	


}

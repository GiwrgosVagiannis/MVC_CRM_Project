package com.vagiannis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vagiannis.dao.EmployeeDAO;
import com.vagiannis.entity.Employee;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
		// inject the Employee Service 
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		//get Employees from the dao
		List<Employee>theEmployees=employeeDAO.getEmployees();
		//add the Employees to theModel
		theModel.addAttribute("employees",theEmployees);
		
		
		return "list-employees";
	}
		
	@GetMapping("/showFormForAddEmployee")
	public String showFormForAdd(Model theModel) {
		//create a new model attribute
		Employee theEmployee=new Employee();
		
		theModel.addAttribute("employee",theEmployee);
		 
		
		
		return "employee-form";
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee theEmployee) {
		
		//save the new employee
		employeeDAO.saveEmployee(theEmployee);
		
		return "redirect:/employees/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId")int theId,
			Model theModel) {
		
	//get the employee from the database
	Employee theEmployee=employeeDAO.getEmployees(theId);
	//set the customer as a model attribute to pre-populate the form 
	theModel.addAttribute("employee",theEmployee);	
	//send over to our form 
	return "employee-form";
}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId")int theId) {
		//delete the customer 
employeeDAO.deleteEmployee(theId);

	
		
		return "redirect:/employees/list";
	} 

	
}

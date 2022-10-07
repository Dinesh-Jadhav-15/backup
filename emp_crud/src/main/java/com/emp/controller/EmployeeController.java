package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/dis")
	public String display() {
	return "Hello";
	}
	
	//Add Employee
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	//ADD mor e employees
	@PostMapping("/addEmployees")
	public List<Employee> addAllEmployee(@RequestBody List<Employee> employee) {
		return employeeService.addEmployees(employee);
	}
	
	//Get Employee by id
	
	@GetMapping("/employeeID/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeByID(id);
	}
	
	//get employee by name
	@GetMapping("/employeeID/{name}")
	public Employee getEmployeeByName (@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	//update employee
	@GetMapping("/updateEmployee")
	public Employee updateEmployee (@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	//delete Employee by id
	@DeleteMapping("/deleteEmployee/{id}")
	public boolean deleteEmployeeByID(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	//Get all
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployess();
	}
}

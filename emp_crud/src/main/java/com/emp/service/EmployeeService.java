package com.emp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService {
	
	@Autowired
	private  EmployeeRepositoryInterface employeeRepositoryInterface;
	
	public Employee addEmployee(Employee employee) {
		return employeeRepositoryInterface.save(employee);
	}

	
	public List<Employee> addEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.saveAll(employees);
	}

	public Employee getEmployeeByID(int id) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findById(id).orElse(null);
	}

	public Employee getEmployeeByName(String name) {
		return employeeRepositoryInterface.findByName(name);
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmp = employeeRepositoryInterface.findById(employee.getId()).orElse(null);
		System.out.print(employee);
		if(existingEmp == null) {
			return  employeeRepositoryInterface.save(employee);
		}else {
			employeeRepositoryInterface.deleteById(existingEmp.getId());
			employeeRepositoryInterface.save(employee);
		}
		return employee;
	}


	public boolean deleteEmployeeById(int id) {

		Employee exisitingEmp = employeeRepositoryInterface.getById(id);
		if(exisitingEmp != null) {
			 employeeRepositoryInterface.deleteById(id);
				return true;
			}
		return false;
	}


	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findAll();
	}

	

}

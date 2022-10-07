package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emp.model.Employee;


public interface EmployeeRepositoryInterface extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);

}

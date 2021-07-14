package com.spring3.employeemanager.repo;

import com.spring3.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
//    Spring is able to understand below name and create delete query
    void deleteEmployeeById(Long id);

//    Optional allows for exception handling if nothing is found
    Optional<Employee> findEmployeeById(Long id);
}

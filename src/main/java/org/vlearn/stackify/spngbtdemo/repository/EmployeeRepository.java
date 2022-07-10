package org.vlearn.stackify.spngbtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vlearn.stackify.spngbtdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}

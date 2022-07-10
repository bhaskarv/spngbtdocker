package org.vlearn.stackify.spngbtdemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.vlearn.stackify.spngbtdemo.model.Employee;
import org.vlearn.stackify.spngbtdemo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
    
    private EmployeeRepository emRepository;

    public EmployeeController(EmployeeRepository emRepository) {
        this.emRepository = emRepository;
    }

    @PostMapping( value = "/addemployee",
                  consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee) {
        emRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return emRepository.findAll();
    }
}

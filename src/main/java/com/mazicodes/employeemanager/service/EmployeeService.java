package com.mazicodes.employeemanager.service;

import com.mazicodes.employeemanager.exception.UserNotFoundException;
import com.mazicodes.employeemanager.model.Employee;
import com.mazicodes.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Emeka Nwachukwu
 * @Email enwachukwu@byteworks.com.ng
 * 4/9/2021-11:38 AM
 */

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeId(Long id) {
        return employeeRepository.findEmployeeById(id)
                .orElseThrow( () -> new UserNotFoundException(" User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}

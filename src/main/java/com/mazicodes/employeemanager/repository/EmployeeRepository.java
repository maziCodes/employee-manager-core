package com.mazicodes.employeemanager.repository;

import com.mazicodes.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Emeka Nwachukwu
 * @Email enwachukwu@byteworks.com.ng
 * 4/9/2021-11:31 AM
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

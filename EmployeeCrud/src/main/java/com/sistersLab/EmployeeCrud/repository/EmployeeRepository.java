package com.sistersLab.EmployeeCrud.repository;

import com.sistersLab.EmployeeCrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

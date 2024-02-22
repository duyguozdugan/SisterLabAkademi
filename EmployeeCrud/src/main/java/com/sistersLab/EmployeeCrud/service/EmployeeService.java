package com.sistersLab.EmployeeCrud.service;

import com.sistersLab.EmployeeCrud.model.Employee;
import com.sistersLab.EmployeeCrud.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public String updateEmployee(Long id,Employee employee) {
      Optional<Employee> employeeId = employeeRepository.findById(id);
      if(employeeId.isPresent()){
          Employee oldEmployee = employeeId.get();
          oldEmployee.setName(employee.getName());
          oldEmployee.setSurname(employee.getSurname());
          oldEmployee.setEmail(employee.getEmail());
          employeeRepository.save(oldEmployee);
          return "Employee updated successfully";
      }
      return null;
    }

    public void deleteEmployee(Long id) {
       employeeRepository.deleteById(id);
    }
}

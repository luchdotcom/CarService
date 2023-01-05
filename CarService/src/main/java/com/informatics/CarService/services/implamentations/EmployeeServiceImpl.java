package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Employee;
import com.informatics.CarService.data.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl extends Employee {
    private final EmployeeRepository employeeRepository;

//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

    List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
}

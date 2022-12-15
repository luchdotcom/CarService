package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Employee;
import org.hibernate.type.LongType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    List<Employee> findAllById(Iterable<Long> longs);
     List<Employee> getEmployeesById(Long id);

     List<Employee> countEmployeeById(Long id);
}

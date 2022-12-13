package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Employee;
import org.hibernate.type.LongType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}

package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {

    List<Car> findAllByrCarMark(String carMark);
    List<Car> countCarByCarMark(String CarMark);
    List <Car> findAll();
}

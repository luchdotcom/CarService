package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.dto.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {

    List<Car> findAllByCarMark(String mark);
    List<Car> countCarByCarMark(String CarMark);
    Car findByRegID(String regID);//todo

}

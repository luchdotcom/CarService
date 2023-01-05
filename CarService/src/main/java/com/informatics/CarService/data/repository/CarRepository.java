package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {

    List<Car> findAllByCarMark(String mark);
    List<Car> countCarByCarMark(String CarMark);
    Car findByRegID(String regId);//todo
    Car findById(long id);//todo

    List <Car> findAll();

}

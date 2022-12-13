package com.informatics.CarService.services.interfaces;

import com.informatics.CarService.data.entitys.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    Car create(Car car);
}

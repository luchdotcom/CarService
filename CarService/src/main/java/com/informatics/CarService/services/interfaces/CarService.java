package com.informatics.CarService.services.interfaces;

import com.informatics.CarService.data.entitys.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    Car getCarById(long id);

    Car getCarByRegId(String regId);//todo

    Car create(Car car);
    Car updateCar(long id,Car car);//todo
    void deleteCar(long id);

}

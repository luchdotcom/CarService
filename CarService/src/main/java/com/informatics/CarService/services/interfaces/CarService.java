package com.informatics.CarService.services.interfaces;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.dto.CarDTO;
import com.informatics.CarService.dto.CreateCarDTO;

import java.util.List;

public interface CarService {
    List<CarDTO> getCars();
    Car getCarById(long id);

    Car getCarByRegId(String regId);

    Car create(CreateCarDTO createCarDTO);
    Car updateCar(long id,Car car);//todo
    void deleteCar(long id);

}

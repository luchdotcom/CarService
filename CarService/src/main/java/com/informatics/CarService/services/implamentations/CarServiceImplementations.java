package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.repository.CarRepository;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImplementations implements CarService {
    private final CarRepository carRepository;

    public CarServiceImplementations(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }
    public Car create(Car car){
        return carRepository.save(car);
    }
}

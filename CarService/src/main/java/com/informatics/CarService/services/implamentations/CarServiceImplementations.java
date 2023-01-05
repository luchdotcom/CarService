package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.repository.CarRepository;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImplementations implements CarService {
    private final CarRepository carRepository;

//    public CarServiceImplementations(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car getCarByRegId(String regId) {
        return null;
    }

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(long id) {
        return carRepository.findById(id);
//                .orElseThrow(() -> new IllegalAccessException("invalid Car id: " + id));
    }

    @Override
    public Car updateCar(long id, Car upCar) {
//        upCar.setId(id);
//        return carRepository.save(upCar);
        return null;
    }

    //    public Car updateCarById(long id){
//        carRepository.updateById(id);
//    }
    @Override
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
}

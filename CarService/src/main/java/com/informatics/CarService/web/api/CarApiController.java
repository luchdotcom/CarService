package com.informatics.CarService.web.api;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarApiController {
    private final CarService carService;

    public CarApiController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }
    @PostMapping
    public Car createCar(@RequestBody Car car){
        return carService.create(car);
    }
}


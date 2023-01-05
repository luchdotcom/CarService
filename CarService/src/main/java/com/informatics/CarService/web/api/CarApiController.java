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
    private final CarService  carService;

//    public CarApiController(CarService carService) {
//        this.carService = carService;
//    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }

    @RequestMapping("/{id}")
    public Car getCarById(@PathVariable("id") int id){
        return carService.getCarById(id);
    }
    @PostMapping
    public Car createCar(@RequestBody Car car){
        return carService.create(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Car updateCar(@PathVariable("id") long id, @RequestBody Car car){
        return carService.updateCar(id,car);
    }

    @DeleteMapping("/id")
    public void deleteCar(@PathVariable ("id")long id){
        carService.deleteCar(id);
    }

}


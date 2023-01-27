package com.informatics.CarService.web.api;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.dto.CarDTO;
import com.informatics.CarService.dto.CreateCarDTO;
import com.informatics.CarService.services.interfaces.CarService;
import com.informatics.CarService.web.view.model.CreateCarViewModel;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarApiController {
    private final CarService  carService;
    private final ModelMapper modelMapper;

//    public CarApiController(CarService carService) {
//        this.carService = carService;
//    }

    @GetMapping
    public List<CarDTO> getCars(){
        return carService.getCars();
    }

    @RequestMapping("/{id}")
    public Car getCarById(@PathVariable("id") int id){
        return carService.getCarById(id);
    }
    @PostMapping
    public Car createCar(@RequestBody CreateCarViewModel car){
        return carService.create(modelMapper.map(car, CreateCarDTO.class));
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


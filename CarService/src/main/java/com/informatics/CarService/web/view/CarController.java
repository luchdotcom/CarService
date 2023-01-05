package com.informatics.CarService.web.view;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;
@Controller
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    @GetMapping
    public String getCars(Model model){
        final List<Car> cars= carService.getCars();
        model.addAttribute("cars",cars);
        return "cars/cars";
    }

    @GetMapping("/create-car")
    public String createCarForm(Model model){
        model.addAttribute("car", new Car() );
        return "cars/create-car";
    }

    @PostMapping("/create")
    public String createCar(@ModelAttribute Car car) {
        carService.create(car);
        return "redirect:/cars";
    }

}

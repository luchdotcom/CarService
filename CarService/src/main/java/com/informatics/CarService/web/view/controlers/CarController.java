package com.informatics.CarService.web.view;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.repository.CarRepository;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
@Controller
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    private final CarRepository carRepository;

    //    private final ModelMapper modelMapper;
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
    public String createCar(@Valid @ModelAttribute("car") Car car) {
        carService.create(car);
        return "redirect:/cars";
    }

    @GetMapping("/edit-car/{id}")
    public String editCarForm(Model model, @PathVariable long id, Car car){
     model.addAttribute("car",carService.getCarById(id));
     return "cars/edit-car";
    }

    @PostMapping("update/{id}")
    public String updateCar(@PathVariable long id,Model model,Car car){
        carService.updateCar(id,car);
        return "redirect:/cars";
    }
    @GetMapping("/search-car-by-regID")
    public String searchCar(){
        return "cars/search-car";
    }
    @GetMapping("/delete/{id}")
    public String dropCar(@PathVariable long id){
        carService.deleteCar(id);
        return "redirect:/cars";
    }
}

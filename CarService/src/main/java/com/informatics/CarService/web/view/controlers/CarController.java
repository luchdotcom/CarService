package com.informatics.CarService.web.view.controlers;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.repository.CarRepository;
import com.informatics.CarService.dto.CarDTO;
import com.informatics.CarService.dto.CreateCarDTO;
import com.informatics.CarService.services.interfaces.CarService;
import com.informatics.CarService.web.view.model.CarViewModel;
import com.informatics.CarService.web.view.model.CreateCarViewModel;
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

    private final ModelMapper modelMapper;

    @GetMapping
    public String getCars(Model model){
        final List<CarViewModel> cars= carService.getCars()
                .stream()
                .map(this::convertToCarViewModel)
                .collect(Collectors.toList());
        model.addAttribute("cars",cars);
        return "/cars/cars";
    }

    private CarViewModel convertToCarViewModel(CarDTO carDTO) {
        return modelMapper.map(carDTO,CarViewModel.class);
    }

    @GetMapping("/create-car")
    public String createCarForm(Model model){
        model.addAttribute("car", new Car() );
        return "cars/create-car";
    }

    @PostMapping("/create")
    public String createCar(@Valid @ModelAttribute("car") CreateCarViewModel car,BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "cars/create-car";
        }
        carService.create(modelMapper.map(car, CreateCarDTO.class));
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

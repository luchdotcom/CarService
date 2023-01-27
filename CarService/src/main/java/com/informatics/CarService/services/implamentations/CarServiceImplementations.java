package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.repository.CarRepository;
import com.informatics.CarService.dto.CarDTO;
import com.informatics.CarService.dto.CreateCarDTO;
import com.informatics.CarService.services.interfaces.CarService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarServiceImplementations implements CarService {
    private final CarRepository carRepository;


    private  final ModelMapper modelMapper;
    @Override
    public List<CarDTO> getCars() {
        return carRepository.findAll().stream().map(this::convertToCarDTO).collect(Collectors.toList());
    }

    public Car getCarByRegId(String regId) {
        return carRepository.findByRegID(regId);
    }

    @Override
    public Car create(CreateCarDTO createCarDTO) {
        return carRepository.save(modelMapper.map(createCarDTO,Car.class));
    }

    public Car getCarById(long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException("invalid Car id: " + id));
    }


//    @Override
//    public Car getCar(long id) {
//        return carRepository.findById(id);
////                .orElseThrow(() ->new IllegalAccessException("invalid Car id =" +id));
//    }
    @Override
    public Car updateCar(long id, Car upCar) {
        upCar.setId(id);
        return carRepository.save(upCar);
//        return null;
    }


    @Override
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
    private CarDTO convertToCarDTO(Car car){
        return modelMapper.map(car,CarDTO.class);
    }
}

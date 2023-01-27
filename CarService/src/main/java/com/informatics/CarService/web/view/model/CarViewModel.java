package com.informatics.CarService.web.view.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.time.LocalDate;

public class CarViewModel {
    private long id;
    private String carMark;

    private String carModel;
    private String regID;

    private LocalDate dateOfManufacture;
}

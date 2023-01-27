package com.informatics.CarService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CarDTO {
    private long id;
    private String carMark;

    private String carModel;

    private String regID;
    private LocalDate dateOfManufacture;

}

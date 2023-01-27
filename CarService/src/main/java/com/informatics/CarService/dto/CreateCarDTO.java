package com.informatics.CarService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class CreateCarDTO {
    private long id;
    private String carMark;
    private String carModel;
    private String regID;
    private LocalDate dateOfManufacture;

}
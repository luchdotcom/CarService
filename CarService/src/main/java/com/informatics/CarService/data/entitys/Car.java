package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car extends BaseEntity {

    private String carMark;

    private String carModel;
    private String regID;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "The data has to be in the past")
    private LocalDate dateOfManufacture;


    @ManyToMany(mappedBy = "cars")
    private List<Owner> owners;
}

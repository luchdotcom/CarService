package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car extends BaseEntity {
//    public Car() {
//    }
//
//    public Car(String carMark, String carModel, String regID, LocalDate dateOfManufacture) {
//        this.carMark = carMark;
//        CarModel = carModel;
//        this.regID = regID;
//        this.dateOfManufacture= dateOfManufacture;
//
//    }
//
//    public String getCarMark() {
//        return carMark;
//    }
//
//    public void setCarMark(String carMark) {
//        this.carMark = carMark;
//    }
//
//    public String getCarModel() {
//        return CarModel;
//    }
//
//    public void setCarModel(String carModel) {
//        CarModel = carModel;
//    }
//
//    public String getRegID() {
//        return regID;
//    }
//
//    public void setRegID(String regID) {
//        this.regID = regID;
//    }

    private String carMark;

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    private String CarModel;
    private String regID;

    private LocalDate dateOfManufacture;


    @ManyToMany(mappedBy = "cars")
    private List<Owner> owners;
}

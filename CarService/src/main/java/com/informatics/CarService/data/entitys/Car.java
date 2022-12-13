package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car extends BaseEntity {
    public Car() {
    }

    public Car(String carMark, String carModel, String regID) {
        CarMark = carMark;
        CarModel = carModel;
        this.regID = regID;
    }

    public String getCarMark() {
        return CarMark;
    }

    public void setCarMark(String carMark) {
        CarMark = carMark;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    private String CarMark;
    private String CarModel;
    private String regID;


    @ManyToMany(mappedBy = "cars")
    private List<Owner> owners;
}

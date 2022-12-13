package com.informatics.CarService.data.entitys;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Repair extends BaseEntity{

    private double price;
    private String dataOfRepair;
    private String RepairType;

    @ManyToOne
    private Car repairCar;

}
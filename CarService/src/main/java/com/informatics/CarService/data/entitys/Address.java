package com.informatics.CarService.data.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity{
    private String city;
    private String street;
    private int streetNumber;

}

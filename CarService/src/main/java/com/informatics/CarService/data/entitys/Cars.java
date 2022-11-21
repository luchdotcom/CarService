package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Cars extends BaseEntity {

    private String CarMark;
    private String CarModel;
    private String regID;


}

package com.informatics.CarService.data.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address extends BaseEntity{
    private String city;
    private String street;
    private int streetNumber;

    @OneToMany(mappedBy ="address")
     private Set<Owner> owners;

    @OneToOne(mappedBy = "address")
    private ServiceStation serviceStation;


}

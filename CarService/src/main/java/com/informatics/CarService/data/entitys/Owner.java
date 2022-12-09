package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Owner extends BaseEntity {


    @OneToMany
//    @JoinColumn
    private List<Car> cars;

    @OneToMany
    private List<Address> addresses;

}

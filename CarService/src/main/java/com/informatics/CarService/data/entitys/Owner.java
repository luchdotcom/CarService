package com.informatics.CarService.data.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "owner")
public class Owner extends BaseEntity {

   // private Address ownerAddress;

    @ManyToMany
    private Set<Car> cars;

    @ManyToOne
    @JsonIgnoreProperties("owner")
    private Address address;

}

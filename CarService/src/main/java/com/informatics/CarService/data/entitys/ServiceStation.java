package com.informatics.CarService.data.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "serviceStation")
public class ServiceStation extends BaseEntity{

    private String serviceName;

    ///Node
    private String city;
    private String address;


    @OneToMany(mappedBy = "serviceStation")
    @JsonIgnoreProperties("serviceStation")
    private List<Employee> employees;

}

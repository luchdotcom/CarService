package com.informatics.CarService.data.entitys;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

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
    
    @ManyToMany
    @JsonIgnoreProperties("employee_id")
    private Set<Employee> employeeSet;

}

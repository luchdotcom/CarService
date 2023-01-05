package com.informatics.CarService.data.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

    private String mechanicName;
    private String qualification;


    @ManyToOne
//    @JoinColumn(name = "employee_id")
    private ServiceStation serviceStation;
    @ManyToMany(mappedBy = "employeeSet")
    private Set<Repair> repairSet;
}

package com.informatics.CarService.data.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

    private String mechanicName;
    private String qualification;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private ServiceStation serviceStation;
}

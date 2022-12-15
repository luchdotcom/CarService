package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.ServiceStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceStationImplementation extends JpaRepository<ServiceStation,Long> {

    List<ServiceStation> getByAddress_Id(Long id);

    List<ServiceStation> getServiceStationByAddress_City(String City);




}

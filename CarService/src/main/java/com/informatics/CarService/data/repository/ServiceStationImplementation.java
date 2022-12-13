package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.ServiceStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceStationImplementation extends JpaRepository<ServiceStation,Long> {
}

package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Car;
import com.informatics.CarService.data.entitys.Repair;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Override
    List<Repair> findAllById(Iterable<Long> longs);
    @Override
    List<Repair> findAll(Sort sort);

    @Override
    List<Repair> findAll();
    List< Repair> findRepairByRepairCar(Car repairCar);
    List<Repair> countRepairByDataOfRepair(String dataOfRepair);
    List<Repair> findRepairById(long id);
}

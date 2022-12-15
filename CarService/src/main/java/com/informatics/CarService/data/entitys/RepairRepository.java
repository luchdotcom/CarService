package com.informatics.CarService.data.entitys;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairRepository extends JpaRepository<Repair,Long> {

    @Override
    List<Repair> findAllById(Iterable<Long> longs);
    @Override
    List<Repair> findAll(Sort sort);

    @Override
    List<Repair> findAll();
    List< Repair> findRepairByName(String name);
    List<Repair> countRepairByDataOfRepair();
    List<Repair> findRepairById(long id);
}

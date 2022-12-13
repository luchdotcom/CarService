package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}

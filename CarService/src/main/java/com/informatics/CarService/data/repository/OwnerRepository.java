package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Address;
import com.informatics.CarService.data.entitys.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

    @Override
    List<Owner> findAllById(Iterable<Long> longs);

    List<Owner> getAllByAddress(List<Address> ownerAddress);

    List<Owner> getByCarsId(Long carId);
    List<Owner> getByCarsMark(String carMark);

}

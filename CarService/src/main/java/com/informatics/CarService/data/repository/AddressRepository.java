package com.informatics.CarService.data.repository;

import com.informatics.CarService.data.entitys.Address;
import com.informatics.CarService.data.entitys.Owner;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface AddressRepository extends JpaRepository<Address,Long>{

    @Override
    List<Address> findAllById(Iterable<Long> longs);

    @Override
    List<Address> findAll(Sort sort);

    @Override
    List<Address> findAll();

    List<Address> getAddressesByIdAndOwners(long id, Set<Owner> owners);
    List<Address> getAddressesByOwnersName(String OwnerName);
}

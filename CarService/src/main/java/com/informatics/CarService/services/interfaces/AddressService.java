package com.informatics.CarService.services.interfaces;

import com.informatics.CarService.data.entitys.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> getAddress();
    public Optional<Address> getAddressById(long id);
    Address create(Address address);
    void deleteAddressById(long id);
}

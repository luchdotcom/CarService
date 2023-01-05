package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Address;
import com.informatics.CarService.data.repository.AddressRepository;
import com.informatics.CarService.services.interfaces.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

//        public AddressServiceImpl(AddressRepository addressRepository){
//        this.addressRepository = addressRepository;
//    }
    @Override
    public List<Address> getAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> getAddressById(long id) {
        return addressRepository.findById(id);

    }

    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddressById(long id) {
        addressRepository.deleteById(id);
    }

}

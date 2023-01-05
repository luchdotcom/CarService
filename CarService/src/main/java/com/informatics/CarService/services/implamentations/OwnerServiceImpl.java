package com.informatics.CarService.services.implamentations;

import com.informatics.CarService.data.entitys.Owner;
import com.informatics.CarService.data.repository.OwnerRepository;
import com.informatics.CarService.services.interfaces.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
//    public OwnerServiceImpl(OwnerRepository ownerRepository){
//        this.ownerRepository = ownerRepository;
//    }

    @Override
    public List<Owner> getOwner() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner create(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner createById(long id) {
        return null;
    }
}

package com.informatics.CarService.services.interfaces;

import com.informatics.CarService.data.entitys.Owner;

import java.util.List;

public interface OwnerService {

    public List<Owner> getOwner();

    public Owner create(Owner owner);
    public  Owner createById(long id); //todo

//    public Owner updateBuId(long id);
}

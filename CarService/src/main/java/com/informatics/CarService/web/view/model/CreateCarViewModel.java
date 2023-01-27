package com.informatics.CarService.web.view.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class CreateCarViewModel {
    private long id;
    @NotBlank
    String carMark;
    String carModel;
    @Size(min = 8, max = 8, message="Min 5, Max 20")
    String regID;
    @NotBlank
    LocalDate dateOfManufacture;




}

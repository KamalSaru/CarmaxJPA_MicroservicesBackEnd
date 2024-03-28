package com.kuebiko.carmaxJPA_MicroservicesBackEnd.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

public class CarOrder {

    private String carOrderID;
    private String orderStatus;

    private List<CarBrand> CarBrand;
}

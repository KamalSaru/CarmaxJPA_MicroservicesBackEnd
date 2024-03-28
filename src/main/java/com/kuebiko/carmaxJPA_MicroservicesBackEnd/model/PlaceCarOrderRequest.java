package com.kuebiko.carmaxJPA_MicroservicesBackEnd.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class PlaceCarOrderRequest {
    private List<CarBrandRequest> CarBrand;
}

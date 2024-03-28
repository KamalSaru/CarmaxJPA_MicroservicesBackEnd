package com.kuebiko.carmaxJPA_MicroservicesBackEnd.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class CarBrand {

    private Long ID;
    private String carID;
    private String brandName;
    private Date manufactorDate;
    private String carModel;
    private String color;
    private Float price;

    private String carOrderID;
}

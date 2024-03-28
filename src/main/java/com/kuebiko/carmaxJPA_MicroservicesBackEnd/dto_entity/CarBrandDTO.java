package com.kuebiko.carmaxJPA_MicroservicesBackEnd.dto_entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(schema = "carmax_automation", name="cars_brands")
@Getter
@Setter

public class CarBrandDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;
    private String carID;
    private String brandName;
    private Date manufactorDate;
    private String carModel;
    private String color;
    private Float price;

    private String carOrderID;
}

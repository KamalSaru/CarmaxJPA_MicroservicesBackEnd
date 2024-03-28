package com.kuebiko.carmaxJPA_MicroservicesBackEnd.dto_entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "carmax_automation", name="car_order")
@Getter
@Setter

public class CarOrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;

    private String carOrderID;
    private String carOrderStatus;

}

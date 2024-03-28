package com.kuebiko.carmaxJPA_MicroservicesBackEnd.service;


import com.kuebiko.carmaxJPA_MicroservicesBackEnd.repository.CarBrandRepository;
import com.kuebiko.carmaxJPA_MicroservicesBackEnd.repository.CarOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarOrderService {

    @Autowired
    private CarOrderRepository carOrderRepository;

    @Autowired
    private CarBrandRepository carBrandRepository;


}

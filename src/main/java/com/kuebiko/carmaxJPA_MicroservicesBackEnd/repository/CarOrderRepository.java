package com.kuebiko.carmaxJPA_MicroservicesBackEnd.repository;

import com.kuebiko.carmaxJPA_MicroservicesBackEnd.dto_entity.CarOrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOrderRepository extends JpaRepository <CarOrderDTO, Long> {

    CarOrderDTO findByCarOrderID(String carOrderID);
}

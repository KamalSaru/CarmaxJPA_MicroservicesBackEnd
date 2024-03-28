package com.kuebiko.carmaxJPA_MicroservicesBackEnd.repository;

import com.kuebiko.carmaxJPA_MicroservicesBackEnd.dto_entity.CarBrandDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarBrandRepository  extends JpaRepository<CarBrandDTO, Long> {

    List<CarBrandDTO> findByCarID(String carID);
}

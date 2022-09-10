package com.example.dsmetaservice.repositories;

import com.example.dsmetaservice.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

//    @Query("SELECT * FROM Sale ")
//    List<Sale> findByPeriod(String minDate, String maxDate);

}

package com.example.dsmetaservice.repositories;

import com.example.dsmetaservice.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

//    @Query("SELECT * FROM Sale ")
//    Page<Sale> findByPeriod(String minDate, String maxDate);

}

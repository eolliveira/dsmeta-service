package com.example.dsmetaservice.repositories;

import com.example.dsmetaservice.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT obj FROM Sale obj WHERE obj.date between :min AND :max ORDER BY obj.amount DESC")
    Page<Sale> findByPeriod(LocalDate min, LocalDate max, Pageable pageable);

}

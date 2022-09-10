package com.example.dsmetaservice.services;

import com.example.dsmetaservice.dto.SaleDTO;
import com.example.dsmetaservice.entities.Sale;
import com.example.dsmetaservice.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Transactional
    public List<SaleDTO> findByPeriod(){
        List<Sale> list = repository.findAll();
        return list.stream().map(s -> new SaleDTO(s)).collect(Collectors.toList());
    }


}

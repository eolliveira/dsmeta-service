package com.example.dsmetaservice.dto;

import com.example.dsmetaservice.entities.Sale;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class SaleDTO {

    private Long id;
    private String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    public SaleDTO(Sale p) {
        this.id = p.getId();
        this.sellerName = p.getSellerName();
        this.visited = p.getVisited();
        this.amount = p.getAmount();
        this.date = p.getDate();

    }
}

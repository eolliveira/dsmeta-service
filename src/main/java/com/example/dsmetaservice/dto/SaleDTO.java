package com.example.dsmetaservice.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class SaleDTO {

    private Long id;
    private String seller_name;
    private Double visited;
    private Double deals;
    private Double amount;
    private Date date;
}

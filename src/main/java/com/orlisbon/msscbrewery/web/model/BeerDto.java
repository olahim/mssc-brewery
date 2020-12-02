package com.orlisbon.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}

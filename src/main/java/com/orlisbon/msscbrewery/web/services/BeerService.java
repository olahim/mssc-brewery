package com.orlisbon.msscbrewery.web.services;

import java.util.UUID;

import com.orlisbon.msscbrewery.web.model.BeerDto;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
	
    BeerDto getBeerById(UUID beerId);
}

package com.thuannt.application.model;

import com.thuannt.application.enums.PriceType;
import com.thuannt.application.enums.PriceUnit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RealEstatePrice {
	private Double price;
	private PriceType type;
	private PriceUnit unit;
}

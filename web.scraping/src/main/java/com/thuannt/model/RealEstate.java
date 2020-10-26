package com.thuannt.model;

import java.math.BigDecimal;

import com.thuannt.enums.RealEstateType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RealEstate {
	private String title;
	private String url;
	private String city;
	private String address;
	private RealEstateType type;
	private BigDecimal price;
	private String acreage;
}

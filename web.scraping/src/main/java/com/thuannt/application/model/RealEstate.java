package com.thuannt.application.model;

import com.thuannt.application.enums.RealEstateType;
import com.thuannt.application.enums.TypeAd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RealEstate {
	private String title;
	private String url;
	private String city;
	private String address;
	private RealEstateType type;
	private RealEstatePrice price;
	private TypeAd typeAd;
	private String acreage;
}

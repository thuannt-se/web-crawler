package com.thuannt.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyPageType {
	PROPERTY_GURU_VIETNAME("https://batdongsan.com.vn/");
	
	private String url;
}

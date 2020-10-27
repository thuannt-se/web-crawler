package com.thuannt.application.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum PropertyPageType {
	
	PROPERTY_GURU_VIETNAME("https://batdongsan.com.vn/");
	
	@Getter
	private String url;
}

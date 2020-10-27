package com.thuannt.application.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomePage {
	
	private List<SubPage> subPages;
	private PropertyPageType pageType;
	private LocalDate createdDate;
	
}

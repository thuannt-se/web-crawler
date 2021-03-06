package com.thuannt.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thuannt.application.model.RealEstate;

@RestController
public class WebScrapingResource {
	
	@GetMapping("/hello-world")
	public RealEstate getAll(@RequestParam(name="url", required=false, defaultValue="test") String url) {
		return new RealEstate();
	}
}

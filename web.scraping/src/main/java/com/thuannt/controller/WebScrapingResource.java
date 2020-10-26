package com.thuannt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thuannt.model.RealEstate;

@Controller
public class WebScrapingResource {

	
	@GetMapping("/hello-world")
	@ResponseBody
	public RealEstate getAll(@RequestParam(name="url", required=false, defaultValue="test") String url) {
		return new RealEstate();
	}
}

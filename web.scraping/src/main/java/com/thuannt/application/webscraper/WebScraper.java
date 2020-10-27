package com.thuannt.application.webscraper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import com.thuannt.application.model.DetailPage;
import com.thuannt.application.model.RealEstate;
import com.thuannt.application.model.SubPage;

public abstract class WebScraper {
	
	abstract Iterable<SubPage> inspectHomePage();
	
	abstract Iterable<DetailPage> inspectSubPage(SubPage subpage);
	
	abstract RealEstate inspectDetailPage(DetailPage detailPage);
	
	protected Iterable<RealEstate> inspect() {
		List<RealEstate> realEstates = new ArrayList<>();
        Iterable<SubPage> subpages = inspectHomePage();
        for (SubPage subpage: subpages) {
            Iterable<DetailPage> detailPages = inspectSubPage(subpage);
            for (DetailPage detailPage: detailPages) {
            	RealEstate classifiedAd = inspectDetailPage(detailPage);
            	realEstates.add(classifiedAd);
            }
        }
        return realEstates;
	}
}

package com.thuannt.application.webscraper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import com.thuannt.application.model.RealEstate;

public abstract class WebScraper {
	
	abstract Iterable<Document> inspectHomePage();
	
	abstract Iterable<Document> inspectSubPage(Document subpage);
	
	abstract RealEstate inspectDetailPage(Document detailPage);
	
	protected Iterable<RealEstate> inspect() {
		List<RealEstate> realEstates = new ArrayList<>();
        Iterable<Document> subpages = inspectHomePage();
        for (Document subpage: subpages) {
            Iterable<Document> detailPages = inspectSubPage(subpage);
            for (Document detailPage: detailPages) {
            	RealEstate classifiedAd = inspectDetailPage(detailPage);
            	realEstates.add(classifiedAd);
            }
        }
        return realEstates;
	}
}

package com.thuannt.application.webscraper;

import java.io.IOException;
import java.time.LocalDate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.thuannt.application.enums.PropertyPageType;
import com.thuannt.application.model.DetailPage;
import com.thuannt.application.model.HomePage;
import com.thuannt.application.model.RealEstate;
import com.thuannt.application.model.SubPage;

public class PropertyGuruVnWebScraper extends WebScraper {
	private static final String classNameWithTag = ".footer-middle";
	
	@Override
	Iterable<SubPage> inspectHomePage() {
		HomePage homePage = initializeHomePage();
		try {
			Document homePageDoc = Jsoup.connect(homePage.getPageType().getUrl()).get();
			Elements links = homePageDoc.select("a[href^="+homePage.getPageType().getUrl()+"]");
			for (Element link : links) {
				System.out.println(link.attr("abs:href"));
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private HomePage initializeHomePage() {
		HomePage homePage = new HomePage();
		homePage.setPageType(PropertyPageType.PROPERTY_GURU_VIETNAME);
		homePage.setHtmlClassNameWithTags(classNameWithTag);
		homePage.setCreatedDate(LocalDate.now());
		return homePage;
	}

	public static void main(String[] args) {
		PropertyGuruVnWebScraper scaper = new PropertyGuruVnWebScraper();
		scaper.inspectHomePage();
		
	}

	@Override
	Iterable<DetailPage> inspectSubPage(SubPage subpage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	RealEstate inspectDetailPage(DetailPage detailPage) {
		// TODO Auto-generated method stub
		return null;
	}

}

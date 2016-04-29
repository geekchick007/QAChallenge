package com.dot.testing.qa.prodjectDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	
By stats = By.id("recordStats");
By record = By.cssSelector(".col-sm-3.projCard.ng-scope");
By moreInfo = By.id("moreInfoButton");
By recordFields = By.className("projectFields");
By search = By.id("input_0");	

	public PageObjects() {
		// TODO Auto-generated constructor stub
	}

	public String getPageTitle(WebDriver driver){
		String actualTitle = driver.getTitle().toLowerCase();
		return actualTitle;
		}
	public boolean statsPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(stats).size() > 0;
		return isPresent;
		}
	public boolean recordsPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(record).size() > 0;
		return isPresent;
		}
	public boolean moreButtonPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(moreInfo).size() > 0;
		return isPresent;
		}
	public boolean searchPresent(WebDriver driver){
		Boolean isPresent = driver.findElements(search).size() > 0;
		return isPresent;	
		
	}
	
}



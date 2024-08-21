  package com.nexttechitc.Pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellsearchPOM {

	WebDriver driver;//global variable
	 
	   public  dellsearchPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	  
	 
	   //@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   @FindBy(id="mh-search-input")
	  
	   WebElement type_dellsearch;
	   public WebElement dellsearch(){
		return type_dellsearch;
	   }
	   
	   @FindBy(xpath="//button[@class=\"mh-search-btn mh-search-submit\"]" )
	   WebElement click_searchicon;
	   public WebElement searchicon(){
		return type_dellsearch;
	   }
}

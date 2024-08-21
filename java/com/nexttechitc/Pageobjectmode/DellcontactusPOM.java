package com.nexttechitc.Pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellcontactusPOM {

	WebDriver driver;//global variable
	 
	   public  DellcontactusPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	  
	   //@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   @FindBy(xpath="//a[@class=\"mh-contact-btn mh-flyout-link no-chevron\"]")
	   WebElement click_contactus;
	   public WebElement contactus(){
		return click_contactus;
		
}
}
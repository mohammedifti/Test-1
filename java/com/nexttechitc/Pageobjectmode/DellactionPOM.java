package com.nexttechitc.Pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {

	WebDriver driver;//global variable
	 
	   public  DellactionPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	  
	   WebElement type_services;
	   public WebElement services(){
		return type_services;
	   }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a" )
	   WebElement type_Allservices;
	   public WebElement Allcervices(){
		return Allcervices();
	   }
	   
}

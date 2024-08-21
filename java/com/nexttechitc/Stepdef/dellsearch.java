package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmode.dellsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellsearch {

	WebDriver driver;
	
	@Given("^user visits dell home page$")
	public void user_visits_dell_home_page() throws Throwable {
		 
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();		   
		  
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
		  // how to open URL		
		driver.get("https://www.dell.com/en-us");				  
	}
	

	@When("^user type  \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		try {
		dellsearchPOM dell=new dellsearchPOM(driver);
		dell.dellsearch().sendKeys(arg1);
		dell.searchicon().click();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		
	}
		catch(Exception e) {
			System.out.println("dell cearch option not working");
		}
	}		
	@Then("^user will be able to redirect to the  Page$")
	public void user_will_be_able_to_redirect_to_the_Page() throws Throwable {
		
		//driver.close();
				driver.quit();
	    
	}


}

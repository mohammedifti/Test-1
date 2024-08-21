package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellcontactus {

	WebDriver driver;	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {	    
		
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();		
		  
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	// how to open URL		
		driver.get("https://www.dell.com/en-us");			
	}
	@When("^user clicks on Dell contact us$")
	public void user_clicks_on_Dell_contact_us() throws Throwable {
	    
	}
	@Then("^user should be able to redirect to the Dell contact us Page$")
	public void user_should_be_able_to_redirect_to_the_Dell_contact_us_Page() throws Throwable {
	    
	}
}

package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmode.AmazonbestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {

	WebDriver driver; 
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
	  
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();		   
		  
	// how to open URL
		driver.get("https://www.amazon.com/");	
		//driver.get("https://www.dell.com/en-us");
		Thread.sleep(500);
	}

	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
	 //we are gonna create object of code
		AmazonbestsellerPOM bestseller=new AmazonbestsellerPOM(driver);
		bestseller.bestseller().click(); 
	}

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
	   
	}
}

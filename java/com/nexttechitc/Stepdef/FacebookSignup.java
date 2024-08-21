package com.nexttechitc.Stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmode.FacebookSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignup {	
	WebDriver driver;	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {				      
		//open browser
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
				  driver = new ChromeDriver();			  			  			  
					
				  //  open URL		
						driver.get("https://www.facebook.com/reg/");												
				        driver.manage().window().maximize();	
				      //explicit wait
				        WebDriverWait wait=new WebDriverWait(driver,30);
	}
	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   FacebookSignupPOM fb=new FacebookSignupPOM(driver);
	 fb.inputFirstname().sendKeys(arg1);
	 fb.inputLastname().sendKeys(arg2);
	 fb.numberOrEmail().sendKeys(arg3);
	 fb.inputPassword().sendKeys(arg4);
	//explicit wait
			WebDriverWait wait=new WebDriverWait(driver,30);
	}
	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FacebookSignupPOM fbsignup1=new FacebookSignupPOM(driver);	
		
		
		Select dropdown=new Select (fbsignup1.click_month);
		dropdown.selectByIndex(2);
		
		Select dropdown1=new Select (fbsignup1.click_day);
		dropdown1.selectByValue("2");
		
		Select dropdown2=new Select (fbsignup1.click_year);
		dropdown2.selectByVisibleText("2000");		
		//explicit wait
				WebDriverWait wait=new WebDriverWait(driver,30);
				//driver.close();
				driver.quit();
	}
}

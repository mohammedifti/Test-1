package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmode.DellactionPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellaction {

	WebDriver driver;
	
	@Given("^user visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
	  
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();		   
		  
	// how to open URL		
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(500);  
		
		
		// Maximize window  
        driver.manage().window().maximize();
        
	}

	@When("^user go to service menu and click on  View All service$")
	public void user_go_to_service_menu_and_click_on_View_All_service() throws Throwable {
		
		Actions act=new Actions(driver);//creating object of action class.
		DellactionPOM Dellservices=new DellactionPOM(driver);//creating object of page object model class.
		act.moveToElement(Dellservices.Allcervices()).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,30);
		//driver.close();
		driver.quit();
		
	 
	}

	@Then("^user redirects to view all service page$")
	public void user_redirects_to_view_all_service_page() throws Throwable {
		
		//driver.close();
				driver.quit();
	}


}

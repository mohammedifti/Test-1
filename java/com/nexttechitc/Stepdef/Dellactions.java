package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmode.DellactionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellactions {
	
	WebDriver driver;
	@Given("^users visit Dell homepage$")
	public void users_visit_Dell_homepage() throws Throwable {
		
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();		   
		  
	// how to open URL		
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(500);  
		
		
		// Maximize window  
        driver.manage().window().maximize();
        
	}

	@When("^users go to service menu and click on  View All service$")
	public void users_go_to_service_menu_and_click_on_View_All_service() throws Throwable {
		Actions act=new Actions(driver);//creating object of action class.
		DellactionsPOM Dellsevices=new DellactionsPOM(driver);//creating object of page object model class.
		act.moveToElement(Dellsevices.Allcervices()).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,30);
		//driver.close();
		driver.quit();
	   
	}

	@Then("^users redirect to view all services page$")
	public void users_redirect_to_view_all_services_page() throws Throwable {
	     
	}



}

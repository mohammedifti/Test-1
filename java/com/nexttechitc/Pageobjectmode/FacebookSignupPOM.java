package com.nexttechitc.Pageobjectmode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignupPOM {
      WebDriver driver;
      
      public FacebookSignupPOM (WebDriver driver) {
   	   this.driver=driver;
   	   PageFactory.initElements(driver, this);
   	   }
       
	 @FindBy(xpath="//*[@id=\"u_4_b_nU\"]")
	 WebElement firstname;
	 public WebElement inputFirstname() {
		 return firstname;
	 }	 
		 @FindBy(xpath="//*[@id=\"u_4_d_MW\"]")
		 WebElement lastname;
		 public WebElement inputLastname() {
			 return lastname;
		 }		 
		 @FindBy(xpath="//*[@id=\"u_4_g_rJ\"]")
		 WebElement numberOrEmail;
		 public WebElement numberOrEmail() {
			 return numberOrEmail();				 
	   }
		 @FindBy(xpath="//*[@id=\"password_step_input\"]")
		 WebElement newPassword;
		 public WebElement inputPassword() {
			 return newPassword;		 
}
		 @FindBy(xpath="//*[@id=\"month\"]")
		 public WebElement click_month;		 

		 @FindBy(id="day") 
		 public WebElement click_day;
		 
		 @FindBy(id="year")
		 public WebElement click_year;
		 
		 @FindBy(id="u_4_5_Jf")
		 public WebElement genderMale;
		 
		// @FindBy(xpath="//*[@id=\"u_4_s_JT\"]")
		// WebElement signUp;
		//public WebElement clickSignup(){
        //}		
}		 
		 
		 

  
        
         
        
		  	  
       


package QAtest.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.paulhammant.ngwebdriver.NgWebDriver;

public class LoginPage {

	  WebDriver driver;
	 NgWebDriver ngwebdriver;
		JavascriptExecutor jsdriver;
		
		// WebElement of Login page
		
		// Locator for Email Address
		By EmailID = By.id("emailAddress");
		// Locator for password
		By Password = By.id("password");
		// Locator for SignIn Button
		By Signinbutton = By.cssSelector("[class='MuiButton-label']");
		// Locator for Success message
		By SuccessMsg = By.className("Home");
		
			
		// Method to type EmailID
		public void typeEmail(String Email)
		{
			driver.findElement(EmailID).sendKeys(Email);
			
		}
		
		// Method to type Password
		public void typePassword(String Pwd)
		{
			driver.findElement(Password).sendKeys(Pwd);
			
		}
		
		// Method to click SiginIn Button
		public void clicksigninbutton()
		{
			driver.findElement(Signinbutton).click();
					
		}
		// Constructor
		// Gets called when object of this page is created in MainClass.java
		public LoginPage(WebDriver driver)
	    {
			this.driver=driver;
	    }
		
		public Boolean MessageDisplayed()
		{
			Boolean status = driver.findElement(SuccessMsg).isDisplayed();
			return status;
		}
		
		
		 
}

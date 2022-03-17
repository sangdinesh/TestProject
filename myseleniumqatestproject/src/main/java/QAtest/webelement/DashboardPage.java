package QAtest.webelement;

import org.openqa.selenium.WebDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class DashboardPage {

	WebDriver driver;
	NgWebDriver ngwebdriver;
	JavascriptExecutor jsdriver;
	
	//ByAngularButtonText Homebutton= ByAngular.buttonText("dashboardExists() && setHomepage()");
	
	// Locator for Home button
	By Homebutton = By.cssSelector("[class='btn btn-primary']");
	
	//Locator for Ok button
	By okbutton = By.xpath("//button[.='OK']");
	
	// Locator for Success message
	By Successmessage = By.tagName("Homepage Set");
	
	//WebElement of Dashboard button in dashboard page
	
	By Dashboardbutton = By.xpath("(//li[contains(@title,'Duplicate Dashboard')])[1]");
	
	//Locator for Name Textbox
	
	By Nametextbox = By.id("name");
	
	//Locator for Ok button
	
	By continuetoclickOK = By.xpath("//button[contains(text(),'OK')]");


			public DashboardPage(WebDriver driver)
		    {
				this.driver=driver;
		    }
			
			// To click homebutton in dashboard page
			
			public void clickhomebutton()
			{
				driver.findElement(Homebutton).click();
				
			} 
			//Click ok button after clicked the Homebutton in dashboard page
			
			public void clickokbutton()
			{
				driver.findElement(okbutton).click();
				
			} 
				
			//Click dashboard button in dashboard page
			
			public void clickdashboardbutton()
			{
				driver.findElement(Dashboardbutton).click();
				
			} 
			
			//Enter the name in "Name Duplicate Dashboard" popup

			public void typename(String input)
			{
				driver.findElement(Nametextbox).sendKeys(input);
				
			} 
			
			//After enter the name click the ok button
			
			public void clickokafterentername()
			{
				driver.findElement(continuetoclickOK).click();
				
			} }
			
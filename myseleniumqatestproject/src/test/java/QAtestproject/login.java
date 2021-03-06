package QAtestproject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;

import QAtest.webelement.DashboardPage;
import QAtest.webelement.LoginPage;
import QAtestcommonmethods.commonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class login extends commonMethods {
	static WebDriver driver;
	static NgWebDriver ngwebdriver;
	JavascriptExecutor jsdriver;
			
	@Test (priority=1,description="Verify Home button on dashboard page")
	@Description("Verify Home Button")   
	@Severity(SeverityLevel.NORMAL)
	public void verifyhomebutton() throws InterruptedException {
		 DashboardPage dashboard=new DashboardPage(driver);
		 dashboard.clickhomebutton(); 
			/*
			 * driver.switchTo().frame("ug-modal-frame"); List<WebElement>
			 * firstbutton=driver.findElements(By.cssSelector("[class='btn btn-primary']"));
			 * System.out.println(firstbutton.size()); new
			 * WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.
			 * xpath("//button[contains(text(),'OK')]"))).click();
			 */
			 
	     dashboard.clickokbutton();
	     ngwebdriver.waitForAngularRequestsToFinish();
	}
	
	@Test (priority=2,description="Verify dashboard button on dashboard page")
	@Description("Verify Dashboard Button")
	@Severity(SeverityLevel.NORMAL)
	public void verifydashboardbutton()
	
	{
		DashboardPage dashboard=new DashboardPage(driver);
		 dashboard.clickdashboardbutton(); 
		 dashboard.typename("XXX");
		 dashboard.clickokafterentername();
		 ngwebdriver.waitForAngularRequestsToFinish();
		 
	}
	}




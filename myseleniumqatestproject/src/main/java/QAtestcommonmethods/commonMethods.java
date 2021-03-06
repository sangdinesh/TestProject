package QAtestcommonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.paulhammant.ngwebdriver.NgWebDriver;

import QAtest.webelement.DashboardPage;
import QAtest.webelement.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class commonMethods {
	public static WebDriver driver;
	static NgWebDriver ngwebdriver;
	JavascriptExecutor jsdriver;
	LoginPage login=new LoginPage(driver);
	DashboardPage dashboard=new DashboardPage(driver);
	
	@BeforeClass 
	
	public void setdriver() 
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	jsdriver = (JavascriptExecutor)driver;
	ngwebdriver=new NgWebDriver(jsdriver);
	driver.get(" https://reference-test.intellisense.io/");
	driver.manage().window().maximize();
	ngwebdriver.waitForAngularRequestsToFinish();
	}

	 @AfterClass 
	 public void closedriver()
	 
	 { 
		 driver.quit(); 
	 }
}


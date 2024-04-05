package TestNG_XML;
//***** incomplete*****

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void beforesuite() {
		//Reporter.log("application is connected to server of database",true);	
	}
	@BeforeMethod
	public void beforetest() {
		Reporter.log("from before test",true);
		//Reporter.log("application is connected to database",true);
	}
	@BeforeClass
	public void beforeclass() {
	Reporter.log("from before class",true);
	//Reporter.log("opening of browser",true);
	//Reporter.log("navigating to url",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		//Reporter.log("login to application",true);
		driver.findElement(By.linkText("log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Email")).sendKeys("selenium444@gamil.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Password")).sendKeys("xyzabc");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[valu=\"Log in\"]")).click();
	@AfterTest
	
				
	}
}

package TestNG_XML;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_01 extends BaseClass {
	@Test
	public void functiontest_01() {
		Reporter.Log("script-01 started",true);
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement()
	}

}

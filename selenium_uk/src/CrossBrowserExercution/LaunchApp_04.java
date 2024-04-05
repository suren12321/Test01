package CrossBrowserExercution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchApp_04 {
	@Parameters("browsername")
	@Test
	public void launch_app(String browsername) {
		WebDriver driver=new FirefoxDriver();
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
	}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("invalid browsname");
		}
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skysports.com");
		driver.quit();	
	}
}

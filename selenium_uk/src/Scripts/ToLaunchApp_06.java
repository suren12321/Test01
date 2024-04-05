package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_06 {
	@Test
	public void launch_app() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skysports.com/");
		//Thread.sleep(1000);
		driver.quit();	
	}
}

package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_03 {
	@Test //(groups = "x")
	public void launch_app() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//Thread.sleep(1000);
		driver.quit();	
	}
}

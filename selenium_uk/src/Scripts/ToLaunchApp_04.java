package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_04 {
	@Test
	public void launch_app() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		//Thread.sleep(1000);
		driver.quit();	
	}
}

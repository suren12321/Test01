package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_02 {
	@Test
	public void launch_app() throws InterruptedException {
		int a=10/0;
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		//Thread.sleep(1000);
		driver.quit();	
	}
}

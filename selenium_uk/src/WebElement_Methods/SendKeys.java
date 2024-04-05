package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
		public static void main(String [] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dream11.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("regEmail")).sendKeys("7507848000");
			Thread.sleep(5000);
			driver.quit();
		
		}
	}

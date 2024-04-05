package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassNameLocator {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.className("email")).sendKeys("SuSu123@yahoo.com");
		driver.findElement(By.className("password")).sendKeys("SuSu123");
		Thread.sleep(4000);
		driver.quit();
	}
}

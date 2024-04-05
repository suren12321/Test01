package Locators;
//logging in with email

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(4000);
		driver.findElement(By.id("Email")).sendKeys("suren@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("12345");
		Thread.sleep(8000);
		
	}
}

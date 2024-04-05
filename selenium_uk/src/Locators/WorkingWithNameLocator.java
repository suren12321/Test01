package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
	public static void main(String [] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/user/login");
	Thread.sleep(4000);
	driver.findElement(By.name("email")).sendKeys("suren@yahoo.com");
	driver.findElement(By.name("password")).sendKeys("12345");
	Thread.sleep(8000);
	}
}

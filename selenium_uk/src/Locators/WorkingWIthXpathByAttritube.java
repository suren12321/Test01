package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWIthXpathByAttritube {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sso.godaddy.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"submitBtn\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}

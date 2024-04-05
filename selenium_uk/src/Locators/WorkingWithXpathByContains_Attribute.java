package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByContains_Attribute {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nykaafashion.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text(),'No thanks']")).click();
		//Thread.sleep(2500);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("any data");
		Thread.sleep(3000);
		driver.quit();
	}
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWIthPartialTextLocator_02 {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("MEN")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}

package Locators;

//clicking button/text 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WorkingWIthLinkedtextLocator {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.quit();
	}	
}

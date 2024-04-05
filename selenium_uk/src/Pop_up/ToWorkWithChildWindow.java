package Pop_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithChildWindow {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(6000);
		
		driver.findElement(By.id("compare")).click();
		Thread.sleep(4000);
		
		Set<String> all_ids = driver.getWindowHandles();
		
		Thread.sleep(5000);
		
		for(String id:all_ids) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(driver.getTitle().contains("Electronics, Cars, Fashion")) {
				driver.close();		
			}
			if(driver.getTitle().contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes")) {
				driver.close();		
			}	
		}
		Thread.sleep(4000);
		//driver.quit();
	}
}
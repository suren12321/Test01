package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandQuit {

		public static void main(String [] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.shoppersstack.com/products_page/6");
			Thread.sleep(6000);
			driver.findElement(By.id("compare")).click();
			Thread.sleep(6000);
			driver.close();//main window/driver is closed
			//driver.quit();//will close all windows
				
		}
	}

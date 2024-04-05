package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSetPosition {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		
		Point p = new Point (50, 70);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000);
		driver.close();
	}
}

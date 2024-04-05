package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandResize {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Dimension size=new Dimension (800, 500);
		driver.manage().window().setSize(size);
		Thread.sleep(5000);
		driver.quit();
	}
}

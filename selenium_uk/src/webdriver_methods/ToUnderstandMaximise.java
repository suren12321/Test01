package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandMaximise {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();//method
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(3000);
		driver.manage().window().minimize();//method
		Thread.sleep(3000);
		driver.manage().window().fullscreen();//method
		Thread.sleep(5000);
		
		driver.quit();
	}
}

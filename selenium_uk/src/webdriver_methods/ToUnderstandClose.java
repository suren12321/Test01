package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandClose {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(6000);
		driver.close();
		
	}
}

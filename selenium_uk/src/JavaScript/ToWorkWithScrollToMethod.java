package JavaScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollToMethod {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);

		driver.executeScript("window.scrollBy(0,500);");//scroll down
		Thread.sleep(3000);
		driver.executeScript("window.scrollBy(0,500);");
		Thread.sleep(1000);
		driver.executeScript("window.scrollTo(0,-50);");//scroll up
		Thread.sleep(1000);
		driver.executeScript("window.scrollTo(0,-50);");//scroll up
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

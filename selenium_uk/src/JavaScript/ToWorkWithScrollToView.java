package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithScrollToView {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		WebElement ele1 = driver.findElement(By.linkText("Build your own computer"));
		
		//driver.executeScript("arguments[0].scrollIntoView(true);",ele1);//top of page
		driver.executeScript("arguments[0].scrollIntoView(false);",ele1);//bottom of the page
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class ToWorkWithClicks {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele_to_click = driver.findElement(By.linkText("Register"));
		
		Actions act=new Actions(driver);
		act.click(ele_to_click).perform();
		
		Thread.sleep(3000);
		//driver.quit();		
	}
}
package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWorkWithImplicitWait {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(38));
		
		WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		driver.get("https://shoppersstack.com/");
		//explicitwait.until(ExpectedConditions.urlToBe("https://shoppersstack.com/"));
		explicitwait.until(ExpectedConditions.urlToBe("https://shoppersstack.com/"));
		
		driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		//Thread.sleep(3000);
		WebElement check_box_btn = driver.findElement(By.id("Check"));
		explicitwait.until(ExpectedConditions.elementToBeClickable(check_box_btn ));
		check_box_btn.click();
	
		driver.quit();
}
}

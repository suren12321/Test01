package JavaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithHiddenElement {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//Alert a=driver.switchTo().activeElement().alert();
		//a.accept();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement custom_gender = driver.findElement(By.name("custom_gender"));
		//custom_gender.sendKeys("selenium");//Element not interactable
		Thread.sleep(3000);
		
		driver.executeScript("arguments[0].value='selenium';",custom_gender);
		Thread.sleep(3000);
			
	}
}
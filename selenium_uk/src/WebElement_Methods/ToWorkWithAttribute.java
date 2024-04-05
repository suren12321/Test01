package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithAttribute {
		public static void main(String [] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/login");
			Thread.sleep(3000);
			
			WebElement email_text_box = driver.findElement(By.id("Email"));
			System.out.println("the data entered is:"+email_text_box.getAttribute("value"));
			email_text_box.sendKeys("Selenium");
			System.out.println("the data entered is:"+email_text_box.getAttribute("value"));
			
			Thread.sleep(4000);
			driver.quit();
		}
	}

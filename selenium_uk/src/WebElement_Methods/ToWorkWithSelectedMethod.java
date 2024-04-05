package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithSelectedMethod {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		
		WebElement remember_check_box = driver.findElement(By.id("RememberMe"));
		System.out.println("first time:"+remember_check_box.isSelected());
		
		if(remember_check_box.isSelected()) {//false
			System.out.println("Not selected");
			//remember_check_box.click();
		}
		else
		{
			remember_check_box.click();
			System.out.println("Is selected");
		}
		Thread.sleep(4000);
		driver.quit();
	}
}

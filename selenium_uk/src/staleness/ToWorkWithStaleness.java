package staleness;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithStaleness {
	public static void main (String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("xyzabc");
		WebElement login_btn = driver.findElement(By.cssSelector("input[value]"))
		
		
	}

}

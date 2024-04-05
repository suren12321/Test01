package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisplayedMethod {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(3000);
		
		WebElement sign_in_link = driver.findElement(By.partialLinkText("SIGN IN"));
		
		if(sign_in_link.isDisplayed()) {
			System.out.println("the website is opened in English Language");
		}
		else {
			System.out.println("the website is opened in another Language");
		}
		Thread.sleep(3000);
		driver.quit();	
	}
}
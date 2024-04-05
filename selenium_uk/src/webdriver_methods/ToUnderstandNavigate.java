package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNavigate {
		public static void main(String [] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");//home page
			System.out.println("first time:"+driver.getTitle());
			Thread.sleep(4000);
			driver.findElement(By.linkText("Log in")).click();//login page
			System.out.println("Login button:"+driver.getTitle());
			Thread.sleep(4000);
			driver.navigate().back();//home page
			System.out.println("after preforming back action:"+driver.getTitle());
			Thread.sleep(4000);
			driver.navigate().forward();//login page
			System.out.println("after preforming forward action:"+driver.getTitle());
			Thread.sleep(4000);
			driver.navigate().refresh();//login page refresh
			System.out.println("Refresh login page:"+driver.getTitle());
			Thread.sleep(4000);
			driver.navigate().to("https://www.google.co.uk/");//navigate to google home page
			System.out.println("go to google site:"+driver.getCurrentUrl());
			Thread.sleep(4000);
			driver.quit();
		}
}

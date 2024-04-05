package Locators;

//selecting gender elements via click action

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElements {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//input[@name='Gender']"));
		System.out.println(elements);//address
		
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			Thread.sleep(3000);
		}
		
		Thread.sleep(3000);
		driver.quit();
		}
	}
//String arr[]={"abc","cde","efd};"

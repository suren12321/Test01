package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkigWithSingleSelect {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		WebElement single_select_list = driver.findElement(By.id("products-orderby"));
		
		Select list = new Select(single_select_list);
		//list.selectByVisibleText("Name: Z to A");
		list.selectByIndex(5);//created on
		//list.selectByValue("");Because it is on the form of URL
		System.out.println("is this multi select drop down?:"+list.isMultiple());
		
				
		Thread.sleep(3000);
		driver.quit();
	}
}
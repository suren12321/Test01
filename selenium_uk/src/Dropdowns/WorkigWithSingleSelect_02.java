package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkigWithSingleSelect_02 {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement single_select_list = driver.findElement(By.id("cars"));
		
		Select list = new Select(single_select_list);
		//list.selectByVisibleText("Name: Z to A");
		list.selectByIndex(3);//INR 200-299
		list.selectByValue("90");//Free(90)
		list.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");//INR 100 - INR 100 (16)
		System.out.println("is this multi select drop down?:"+list.isMultiple());//true
		
				
		Thread.sleep(6000);
		System.out.println("selected count:"+ list.getAllSelectedOptions().size());//3
		
		
		//list.getAllSelectedOptions();
		//list.deselectByIndex(0); //FREE(90)
		int size = list.getOptions().size();
		System.out.println("total options availble according to actual count:"+size);
		System.out.println("total options availble accoreding to index:"+(size-1));
		
		list.selectByIndex(size-1);//last option
		//list.deselectAll();//remove all your selected value
		Thread.sleep(4000);
		driver.quit();
	}
}
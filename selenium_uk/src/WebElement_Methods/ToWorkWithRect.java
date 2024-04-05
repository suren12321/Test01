package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithRect {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		
		WebElement first_name_field = driver.findElement(By.id("FirstName"));
		WebElement last_name_field = driver.findElement(By.id("LastName"));
		
		System.out.println("x coordinate value for the first name text field:"+first_name_field.getRect().getX());
		System.out.println("x coordinate value for the first name text field:"+last_name_field.getRect().getX());
	
		if(first_name_field.getRect().getX()==last_name_field.getRect().getX()) {
			System.out.println("its alligned properly");
		}
		else
		{
			System.out.println("its not alligned properly");
		}
	
		int fname_y_value = first_name_field.getRect().getPoint().getY();
		int lname_y_value = last_name_field.getRect().getPoint().getY();
		
		System.out.println("Y axis value for first name is:"+fname_y_value);
		System.out.println("Y axis value for last name is:"+lname_y_value);
		
		int fname_height = first_name_field.getRect().getDimension().getHeight();
		int fname_width = first_name_field.getRect().getWidth();
		int lname_height = last_name_field.getRect().getHeight();
		int lname_width = last_name_field.getRect().getWidth();
		
		System.out.println("********************");
		System.out.println("first name");
		System.out.println("width:"+fname_width);
		System.out.println("height:"+fname_height);
		System.out.println("********************");
		System.out.println("last name");
		System.out.println("width:"+lname_width);
		System.out.println("height:"+lname_height);
		System.out.println("********************");
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}

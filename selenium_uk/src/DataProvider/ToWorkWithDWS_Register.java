package DataProvider;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDWS_Register {
	public static void main (String[] args) throws InterruptedException {
	ChromeDriver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("Demo Web Shop register")) {
		System.out.println("you are in Register page");
	}
	else {
		System.out.println("you are not in Register page");
	}	
	
	//
}
}
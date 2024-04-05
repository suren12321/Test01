package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetPosition {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Point axis_value = driver.manage().window().getPosition();
		System.out.println(axis_value);
		int x_axis=driver.manage().window().getPosition().getX();
		System.out.println("x axis value:"+x_axis);
		int y_axis=driver.manage().window().getPosition().getY();
		System.out.println("y axis value:"+y_axis);
		Thread.sleep(5000);
		driver.quit();
		
	}
}

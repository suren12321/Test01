package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithYourAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click(); 
		
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		a.accept();//will click on "ok" btn
		
		Thread.sleep(4000);
		driver.quit();
	}
}
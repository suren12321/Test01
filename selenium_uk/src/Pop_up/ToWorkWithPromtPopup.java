package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToWorkWithPromtPopup {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("Suren Parmar");//
		Thread.sleep(5000);
		a.accept();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
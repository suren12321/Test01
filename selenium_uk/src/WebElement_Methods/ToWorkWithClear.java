package WebElement_Methods;

//clear text example from the search bar

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithClear {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement search_box = driver.findElement(By.id("small-searchterms"));
		search_box.sendKeys("book");
		Thread.sleep(5000);
		search_box.clear();
		Thread.sleep(5000);
		search_box.sendKeys("computer");
		Thread.sleep(5000);
		driver.quit();
	}
}

package Pop_up;
//*******incomplete*******

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkFileUpload_01 {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://optellum.com");
		Thread.sleep(3000);
		
		//WebElement button = driver.findElement(By.id("searchform-dropdown"));
		WebElement ele_to_click = driver.findElement(By.xpath("//span[text()='Toggle website search']"));
		
		
        //String searchform_dropdown = "Cambridge"; // Change the search term here
        //searchInput.sendKeys(searchform-dropdown);
        //searchInput.sendKeys(Keys.RETURN);
			
	}
}

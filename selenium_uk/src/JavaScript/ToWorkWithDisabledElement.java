package JavaScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithDisabledElement {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		
		driver.executeScript"arguments[0].value='selenium';"'disable_)

		Thread.sleep(3000);
		driver.quit();

}
}
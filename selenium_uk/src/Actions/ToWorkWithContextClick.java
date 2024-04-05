package Actions;
//right click on mouse
//use of Xpath


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithContextClick {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
		WebElement right_click_ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.contextClick(right_click_ele).perform();
		
		Thread.sleep(3000);
		driver.quit();		
}
}

package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandAndSwitchNewWindow {
	public static void main(String [] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://skillraya.com/user/login");
		System.out.println("Login button:"+driver.getTitle());
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		driver.quit();
}
}
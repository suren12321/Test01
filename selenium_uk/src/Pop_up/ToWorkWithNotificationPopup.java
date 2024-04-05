package Pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithNotificationPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//ChromeOptions settings=newChromeOptions();
		//Settings.addarguement("--disable-notifcations");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.puma.com/in/en/collaborations");
		
		Thread.sleep(8000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.quit();
			
	}
}
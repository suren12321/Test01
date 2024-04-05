package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfError {
public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(4000);
		
		driver.findElement(By.id("register-button")).click();
		
		LocalDateTime time = LocalDateTime.now();//current time along with seconds
		String Date_Time = time.toString();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny = new File("./ScreenShot//"+Date_Time+"Error_Snap.png");
		
		FileHandler.copy(source, destiny);
		
		Thread.sleep(3000);
		driver.quit();		
	}
}
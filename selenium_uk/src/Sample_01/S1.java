package Sample_01;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		LocalDateTime time = LocalDateTime.now();//current time along with seconds
		String Date_Time = time.toString();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destiny=new File("./ScreenShot//"+Date_Time+"_Snap.png");
		//File destiny=new File("./ScreenShots/PageSnap.png");
		
		FileHandler.copy(source, destiny);
		
		Thread.sleep(3000);
		driver.quit();
		
}
}


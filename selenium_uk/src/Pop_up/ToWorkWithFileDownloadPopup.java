package Pop_up;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithFileDownloadPopup {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("https://www.oracle.com/java/latest/jdk-21_")).click();
		
		Thread.sleep(3000);
			
	}
}

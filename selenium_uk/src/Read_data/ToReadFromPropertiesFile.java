package Read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFromPropertiesFile {
public static void main(String[] args) throws InterruptedException, IOException {
		File file=new File("./Resources/PropertiesFile.properties");
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");//fetch the respective value
		System.out.println(url);
		String email = prop.getProperty("email");
		System.out.println(prop.getProperty("login"));
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		WebElement email_field = driver.findElement(By.id("Email"));
		email_field.sendKeys("Suren@yahoo.com");
		
		
		
	}
}

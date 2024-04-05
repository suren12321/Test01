package Optellum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://optellum.com");
	Thread.sleep(5000);
	
	WebElement ele_to_click = driver.findElement(By.xpath("//li[@class=\"search-toggle-li\"]"));
	ele_to_click.click();
	Thread.sleep(2000);
	WebElement searchInput = driver.findElement(By.id("ocean-search-form-1"));
    String searchTerm = "Cambridge";
    searchInput.sendKeys(searchTerm);
    searchInput.sendKeys(Keys.RETURN);
    //working up to here
    Thread.sleep(4000);
     
    String Count=driver.findElement(By.id("search-results-count")).getText();
    
    System.out.println("You searched for: " + searchTerm);
    System.out.println(Count + " search results found");
   
    
    List<WebElement> articleElements = driver.findElements(By.tagName("article"));
    //System.out.println("Number of articles displayed: " + articleElements.size());

    if (Integer.parseInt(Count.split(" ")[0]) == articleElements.size()) {
        System.out.println("Test PASSED: Number of search results matches the number of results found.");
    } else {
        System.out.println("Test FAILED: Number of search results does not match the number of results found.");
    }

    driver.quit();
	}      
}

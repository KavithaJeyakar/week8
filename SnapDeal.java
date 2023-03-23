package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		Thread.sleep(5000);
		
		WebElement eleMen = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		
		
		//Step1 : Create Object for Actions class
		
		Actions builder = new Actions(driver);
		
		//Step2: Build the actions
		
		builder.moveToElement(eleMen).pause(Duration.ofSeconds(5))
		  .click(driver.findElement(By.xpath("(//span[text()='Shirts'])"))).perform();	
		
		
		  WebElement eleHeart = driver.findElement
				  (By.xpath("(//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre'])[2]"));
		  
		 builder.moveToElement(eleHeart) .pause(Duration.ofSeconds(5))
		  .click(driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[2]")))
		 .perform();
		 
/*
  		WebElement eleAllow = driver.findElement(By.id("pushAllow"));
		
		//Step1: Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				
		//Step2: Apply the expected condition
		wait.until(ExpectedConditions.invisibilityOf(eleAllow));
		
		
		  //Thread.sleep(10000);
		  
		  WebElement eleMensFashion =
		  driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		  
		  Actions builder = new Actions(driver); builder.moveToElement(eleMensFashion)
		  .pause(Duration.ofSeconds(2))
		  .click(driver.findElement(By.xpath("(//span[text()='Shirts'])"))) .perform();		 
 */
		 
		 
	}
}

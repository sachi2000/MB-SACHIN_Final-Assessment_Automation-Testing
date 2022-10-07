package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ApplyLeave {
  @Test
  public void apply() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
		Thread.sleep(1000);
		
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[2]/input")).click();
	        driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranjitha");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        driver.findElement(By.linkText("Leave")).click();
	  	    driver.findElement(By.linkText("Apply")).click();
	        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
	        driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	        driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
	        driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
	        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
  }
  
}

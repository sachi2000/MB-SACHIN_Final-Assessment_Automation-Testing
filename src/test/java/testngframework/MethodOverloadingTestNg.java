package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodOverloadingTestNg {
	private static WebDriver driver = null;
	
	
	
  @Test
  public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		MethodOverloadingTestNg obj=new MethodOverloadingTestNg();
		obj.search("Admin");
		obj.search("Admin","Paul Collings");
		
			
  }

		@Test
		  public void search(String username) {
			driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//form/div/div/div/div/div/input")).sendKeys(username);
			driver.findElement(By.xpath("//button[@type='submit']")).click();	
  }

		@Test
		  public void search( String username,String empname) {
			driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} 
			

}

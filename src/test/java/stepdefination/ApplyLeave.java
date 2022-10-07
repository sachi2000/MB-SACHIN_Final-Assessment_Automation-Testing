package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testngframework.MethodOverloadingTestNg;

public class ApplyLeave {

		// TODO Auto-generated method stub
		private static WebDriver driver = null;
		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page()  {
			
			System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
			driver = new ChromeDriver();
            
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		}

		@When("user enters username and password")
		public void user_enters_username_and_password() {
			
			 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Using Xpath only....We can use,Id aslo
	            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();
	           ApplyLeave  obj=new ApplyLeave();
	    		obj.search("Admin");
	    		obj.searchall("Admin","Paul Collings");

	    		
	    		}
		@Then("home page is displayed")
		public void home_page_is_displayed() {
			   String actualresult, expectedresult;
	            expectedresult="PIM";
	            actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
	            SoftAssert soft= new SoftAssert();
	            soft.assertEquals(actualresult, expectedresult);
		}
		

	    @Then("apply leave is displayed")
	    		public void apply_leave_is_displayed() {
	            	  driver.findElement(By.linkText("Leave")).click();
	      	  	    driver.findElement(By.linkText("Apply")).click();
	      	        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
	      	        driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	      	        driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
	      	        driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
	      	        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	            }
	    
	    @When("search")
		public void search(String username) {
	    	driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//form/div/div/div/div/div/input")).sendKeys(username);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
		}
	    @Then("search")
		public void searchall(String username,String empname) {
	    	driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	    }

}

	



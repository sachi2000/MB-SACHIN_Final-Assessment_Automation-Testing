package alertshandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		     	      	
        driver.findElement(By.name("cusid")).sendKeys("SACHIN");					
        driver.findElement(By.name("submit")).submit();			
        		
        Alert alert = driver.switchTo().alert();		        		
           
        String alertMessage= driver.switchTo().alert().getText();		
        			
        System.out.println(alertMessage);	
        Thread.sleep(2000);		
        alert.accept();	

	}

}

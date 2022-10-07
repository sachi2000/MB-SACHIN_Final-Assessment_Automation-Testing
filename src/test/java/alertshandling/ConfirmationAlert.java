package alertshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();		     
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		  
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");		   
				WebElement c=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
				c.click();		      
				Alert a = driver.switchTo().alert();		     
				String s = a.getText();
				System.out.println("Alert text is: " + s);
				Thread.sleep(2000);
				a.dismiss();

	}

}

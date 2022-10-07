package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   Actions mouse= new Actions(driver);
		   driver.get("http://www.jqueryui.com/droppable/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.switchTo().frame(0);
		   	WebElement drag=driver.findElement(By.id("draggable"));
			WebElement drop=driver.findElement(By.id("droppable"));
			mouse.dragAndDrop(drag,drop).perform();
			Thread.sleep(3000);
			

	}

}

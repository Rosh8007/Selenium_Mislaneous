package JavaScriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAllMethods {





	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();


		WebElement  nameEle=driver.findElement(By.xpath("//*[@id=\"name\"]"));

		JavascriptExecutor js=(JavascriptExecutor)driver;

		

		// Instead of send Keys
		js.executeAsyncScript("arguments[0].setAttribute('value','Roshan')", nameEle);

		//insted of click()
	

		
		WebElement   sunday=driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		js.executeScript("arguments[0].click();", sunday);
	}


}

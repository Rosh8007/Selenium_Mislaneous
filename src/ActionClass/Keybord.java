package ActionClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keybord {


	//

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement  link=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[4]/a"));
		
		
		Thread.sleep(1000);
		
		
		//press control and then click
		
		Actions ac=new Actions(driver);
		
		
		
		ac.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		
		
		
		
//		 Set<String> handel=driver.getWindowHandles();
//		 
//		 List<String> list=new ArrayList<String>(handel);
//		 
//		 for(String  x:list) 
//		 {
//			 driver.switchTo().window(x);
//		 }
		 


		
		
		
		
		
	}

}

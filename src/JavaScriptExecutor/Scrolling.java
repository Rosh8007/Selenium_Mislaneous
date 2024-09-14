package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		js.executeScript("window.scrollBy(0,1000)","" );
		
		Thread.sleep(2000);
		WebElement nameElement = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input"));
		js.executeScript("arguments[0].scrollIntoView();", nameElement);
		
		
		Thread.sleep(2000);
		WebElement   wikiEle=driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]"));

		js.executeScript("arguments[0].scrollIntoView();", wikiEle);
	}

}

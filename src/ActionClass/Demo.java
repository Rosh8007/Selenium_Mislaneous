package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		WebElement  desktopEle=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']"));
		
		WebElement   mapcopt=driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
		
		
		Actions ac=new Actions(driver);
		ac.moveToElement(desktopEle).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mapcopt.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
	}

}

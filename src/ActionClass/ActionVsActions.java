package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	
	//Actions:- used to perform mouse action
	//Action:- used to store mouse action

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");


		driver.manage().window().maximize();

		WebElement desktop=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));

		Actions ac=new Actions(driver);
		
		Action  action=ac.contextClick(desktop).build();
		
		action.perform();


	}

}

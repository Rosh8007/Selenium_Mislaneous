package ActionClass;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {



	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://text-compare.com/");

		driver.manage().window().maximize();

		WebElement	txtBox1=driver.findElement(By.id("inputText1"));
		WebElement	txtbox2=driver.findElement(By.id("inputText2"));

		txtBox1.sendKeys("Roshan Aware");

		Actions ac=new Actions(driver);

		//Press Control + A.
		ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// Press Control + C
		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// Press Control + Tab

		Thread.sleep(1000);
		ac.sendKeys(Keys.TAB).perform();

		ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// Press Control + v
		ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}

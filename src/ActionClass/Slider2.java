package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider2 {

	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("");

		driver.manage().window().maximize();

	//	driver.switchTo().frame(0);

		WebElement	slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));

		System.out.println(slider.getLocation());

		
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(slider, 200, 251).perform();
		
		System.out.println("Location After Action");
		
		System.out.println(slider.getLocation());
	}
}

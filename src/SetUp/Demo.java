package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {


	public static void main(String[] args)throws ArithmeticException {

		System.setProperty("webdriver.chrome.driver","F:\\CJC\\Cmd123\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/register");

		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#gender-male")).click();

		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Ros");

		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Aware");

		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Rosh@123456567gmail.com");

		driver.findElement(By.cssSelector("input#Password")).sendKeys("Rosh@1234");

		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("Rosh@1234");

		driver.findElement(By.cssSelector("input#register-button")).click();

		String	text=driver.findElement(By.cssSelector("div[class='result']")).getText();
		
		System.out.println(text);
		
		//driver.close();

	}

}

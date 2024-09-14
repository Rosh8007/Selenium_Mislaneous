package JavaScriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ZooMLevel {


	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");


		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
	}

}

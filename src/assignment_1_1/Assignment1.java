package assignment_1_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static WebDriver driver ;
	
	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Backup\\Chromedriver\\chromedriver-win64\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}

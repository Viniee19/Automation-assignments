package assignment_1_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String Title_of_the_page = driver.getTitle();
		System.out.println("The title : "+ Title_of_the_page);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current URL : "+currentUrl);
		
		String expectedUrl = "https://www.google.com/"; // Replace with the expected URL

	        if (currentUrl.equals(expectedUrl)) {
	            System.out.println("Obtained URL is correct.");
	        } else {
	            System.out.println("Obtained URL is incorrect. Expected: " + expectedUrl + ", Actual: " + currentUrl);
	        }
		
		driver.close();
	
	}

}

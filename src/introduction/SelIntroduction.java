package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Use WebDrivers
		//Chrome- ChromeDriver
		//Firefox- FirefoxDriver
		//Safari- SafariDriver
		//Syntax
		//ChromeDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahai\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}

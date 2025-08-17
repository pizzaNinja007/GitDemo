package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahai\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//to perform activities with the browser window use below method
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//If you want to move to another url without using get and in same automation browser
		driver.navigate().to("https://rahulshettyacademy.com");
		//To move back
		driver.navigate().back();
		//To move forward
		driver.navigate().forward();
		driver.close();

	}

}

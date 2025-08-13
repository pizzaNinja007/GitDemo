package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="john";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahai\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=(driver.findElement(By.cssSelector("form p")).getText());
		//Please use temporary password 'rahulshettyacademy' to Login.
		//This will divide the string into 2 arrays
		//0th index- Please use temporary password
		//1st index- rahulshettyacademy' to login
		
		String[] passwordArray = passwordText.split("'");
		String[] passwordArray2 = passwordArray[1].split("'");
		//This will divide the String present in 1st index of passwordArray into further 2 arrays
		//0th index- rahulshettyacademy
		//1st index-  to login
		return passwordArray2[0];
		
	}

}

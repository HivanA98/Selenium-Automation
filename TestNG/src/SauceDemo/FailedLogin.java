package SauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailedLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //CSS used ID		
		driver.findElement(By.id("password")).sendKeys("wrongPassword");		
		driver.findElement(By.className("btn_action")).click();	//CSS used class	
		System.out.println(driver.findElement(By.cssSelector(".error-message-container")).getText());
	}

}

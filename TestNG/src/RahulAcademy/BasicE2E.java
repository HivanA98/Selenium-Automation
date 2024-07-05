package RahulAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicE2E {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.findElement(By.name("name")).sendKeys("ivan");
		driver.findElement(By.name("email")).sendKeys("ivan@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02-12-2010");
		
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-success")).getText());
	}

}

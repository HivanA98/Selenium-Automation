package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxt01 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("userName")).sendKeys("My Full Name");
		driver.findElement(By.id("userEmail")).sendKeys("MyEmail@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Now I Living in Jakarta");
		driver.findElement(By.id("permanentAddress")).sendKeys("My Permanent addreas as Indonesian");
		
		driver.findElement(By.id("submit")).click();

	}

}

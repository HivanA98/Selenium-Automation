package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.className("rct-checkbox")).click();
		
	}

}

package HeroKuApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefEmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("btn-make-appointment")).click();
		
		driver.findElement(By.linkText("info@katalon.com")).click();	

	}

}

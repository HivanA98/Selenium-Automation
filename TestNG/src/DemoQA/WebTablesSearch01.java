package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesSearch01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("searchBox")).sendKeys("Vega");
		WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Cierra')]"));
		System.out.println("Element text: " + element.getText());
	}

}

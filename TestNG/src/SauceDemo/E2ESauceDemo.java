package SauceDemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ESauceDemo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //CSS used ID		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		driver.findElement(By.className("btn_action")).click();	//CSS used class	
		
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click(); //Used XPath generic syntax
		driver.findElement(By.cssSelector("button[id='add-to-cart-sauce-labs-bike-light']")).click(); //Used CSS generic syntax 
		driver.findElement(By.className("shopping_cart_link")).click();	//CSS used class	
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Ivan");
		driver.findElement(By.id("last-name")).sendKeys("Armadi");
		driver.findElement(By.id("postal-code")).sendKeys("Jakarta");
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("finish")).click();
	}

}

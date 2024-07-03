package HeroKuApp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FalseLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("btn-make-appointment")).click();
			
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("awwwww");
		driver.findElement(By.id("btn-login")).click();
	
		System.out.println(driver.findElement(By.cssSelector(".text-danger")).getText());
		
	}

}

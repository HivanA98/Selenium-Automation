package HeroKuApp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1E2EHeroKuApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("btn-make-appointment")).click();
			
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		driver.findElement(By.id("txt_visit_date")).sendKeys("22/10/2024");
		driver.findElement(By.id("btn-book-appointment")).click();

		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
		
	}

}

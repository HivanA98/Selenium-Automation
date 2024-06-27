package HeroKuApp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2EHeroKuApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("btn-make-appointment")).click();
			
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		driver.findElement(By.id("combo_facility")).click();
		driver.findElement(By.xpath("//option[@value='Seoul CURA Healthcare Center'][3]"));
		
//	driver.findElement(By.id("chk_hospotal_readmission")).click();
		
		driver.findElement(By.id("btn-login")).click();
		
		
	}

}

package commerceos.staging.devpayever;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://commerceos.staging.devpayever.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//username = tesst@yahoo.com
		//password = RaMaDi!2#4
	}

}

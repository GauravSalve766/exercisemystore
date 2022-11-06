package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadConfigPropFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	public void initialization() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadConfigPropFile.readConfigPropFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}

package TestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.Capturescreenshot;

public class LoginPageTest extends TestBase {

	public LoginPage page;
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		page = new LoginPage();
	}
	
	@Test
	public void verifyloginfunctionalityTest() throws Exception {
		page.verifyloginfunctionality();
	}
	
	@AfterMethod
	public void exit(ITestResult it) throws Exception {
		
		if(ITestResult.FAILURE==it.getStatus()) {
			Capturescreenshot.captureScreenshot(driver, it.getName());
		}
		driver.close();
	}
}

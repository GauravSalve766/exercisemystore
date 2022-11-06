package TestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Utility.Capturescreenshot;

public class HomePageTest extends TestBase {

	public HomePage page1;
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		LoginPage page = new LoginPage();
		page.verifyloginfunctionality();
		page1 = new HomePage();
	}
	
	@Test
	public void verifywomenTshirtbtnTest() {
		page1.verifywomenTshirtbtn();
	}
	
	@Test
	public void verifywomenevendressbtnTest() {
		
		page1.verifywomenevendressbtn();
	}
	
	@Test
	public void verifydresssummerbtnTest() {
		page1.verifydresssummerbtn();
	}
	
	@Test
	public void verifytshirtcatgbtnTest() {
		page1.verifytshirtcatgbtn();
	}
	
	@AfterMethod
	public void exit(ITestResult it) throws Exception {
		
		if(ITestResult.FAILURE==it.getStatus()) {
			Capturescreenshot.captureScreenshot(driver, it.getName());
		}
		driver.close();
	}
}

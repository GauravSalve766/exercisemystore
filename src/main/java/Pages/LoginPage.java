package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadConfigPropFile;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@class='login']") private WebElement signinbtn;
	@FindBy(xpath = "//input[@id='email']") private WebElement emailaddresstextbox;
	@FindBy(xpath = "//input[@id='passwd']") private WebElement passwordtextbox;
	@FindBy(xpath = "//button[@name='SubmitLogin']") private WebElement submitsigninbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyloginfunctionality() throws Exception {
		
		signinbtn.click();
		emailaddresstextbox.sendKeys(ReadConfigPropFile.readConfigPropFile("emailid"));
		passwordtextbox.sendKeys(ReadConfigPropFile.readConfigPropFile("password"));
		submitsigninbtn.click();
		
	}

}

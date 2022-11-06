package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {

	Actions s = new Actions(driver);
	
	@FindBy(xpath = "//a[@title='Women']") private WebElement womencatgbtn;
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]") private WebElement tshirtbtn;
	@FindBy(xpath = "(//a[text()='Evening Dresses'])[1]") private WebElement evedressbtn;
	@FindBy(xpath = "(//a[text()='Dresses'])[2]") private WebElement dressesbtn;
	@FindBy(xpath = "(//a[text()='Summer Dresses'])[2]") private WebElement summerdressbtn;
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]") private WebElement tshirtcatgbtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifywomenTshirtbtn() {
		
//		Actions s = new Actions(driver);
		s.moveToElement(womencatgbtn).build().perform();
		tshirtbtn.click();
		
	}
	
	public void verifywomenevendressbtn() {
//		Actions s = new Actions(driver);
		s.moveToElement(womencatgbtn).build().perform();
		evedressbtn.click();
	}
	
	public void verifydresssummerbtn() {
		s.moveToElement(dressesbtn).build().perform();
		summerdressbtn.click();
	}
	
	public void verifytshirtcatgbtn() {
		tshirtcatgbtn.click();
	}
	
}

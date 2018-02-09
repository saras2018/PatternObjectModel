package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRM;
	public MyHomePage clickCRM(){
		click(eleCRM);
		return new MyHomePage(driver, test);
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo Sales Manager')]]")
	private WebElement eleLoggedName;
	public HomePage verifyLoggedInName(String text) {
		verifyPartialText(eleLoggedName, text);
		return this;
	}
	
	
	

}

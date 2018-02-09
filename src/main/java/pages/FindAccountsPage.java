package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindAccountsPage extends ProjectMethods{
	
	public FindAccountsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='DemoAccount1']")
	private WebElement eleDemoAcc1;
	public CreateLeadPage clickDemoAccount1(){
		click(eleDemoAcc1);
		switchToWindow(0);
		return new CreateLeadPage(driver, test);
	}
	
	
	
	
	
	

}

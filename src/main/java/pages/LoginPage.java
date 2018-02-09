package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName ;
	public LoginPage enterUserName(String data) {
		type(eleUserName,data);
		return this;
	}

	@FindBy(how=How.ID,using="password")
	private WebElement elepassword;
	public LoginPage enterPassword(String data) {
		type(elepassword, data);
		return this;
	}


	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	public HomePage clickLogin() {
		click(eleLogin);
		//HomePage hp = new HomePage();
		return new HomePage(driver,test);
	}

	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	public LoginPage verifyErrMsg(String text) {
		verifyPartialText(eleErrorMsg, text);
		return this;
	}

	
	public LoginPage clickLoginFailure() {
		click(eleLogin);
		return this;
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompName;
	public EditLeadPage enterCompName(String company){
		type(eleCompName, company);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdate;
	public ViewLeadPage clickUpdate(){
		click(eleUpdate);
		return new ViewLeadPage(driver, test);
	}
	
	
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	public CreateLeadPage compName(String company) {
		type(eleCompName, company);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefName;
	public CreateLeadPage firstName(String fName) {
		type(elefName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage lastName(String lName) {
		type(eleLastName, lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	public CreateLeadPage pHone(String phn) {
		type(elePhone, phn);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEMail;
	public CreateLeadPage eMail(String eml) {
		type(eleEMail, eml);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleDropDownSource;
	public CreateLeadPage dropDownSource(){
		selectDropDownUsingText(eleDropDownSource, "Existing Customer");
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='parentPartyId']/following-sibling::a")
	private WebElement elePrntAccnt;
	public FindAccountsPage parentAccount(){
		click(elePrntAccnt);
		switchToWindow(1);
		return new FindAccountsPage(driver, test);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleBtn;
	public ViewLeadPage clickCreateLeadButton(){
		click(eleBtn);
		return new ViewLeadPage(driver, test);
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID , using ="viewLead_companyName_sp")
	private WebElement eleCompName;
	public void printCompName(){
		System.out.println("The company name is "+eleCompName+ " ");
		closeBrowser();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditBtn;
	public EditLeadPage clickEditBtn(){
		click(eleEditBtn);
		return new EditLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLeadBtn;
	public DuplicateLeadPage clickDuplicateLeadBtn(){
		click(eleDuplicateLeadBtn);
		return new DuplicateLeadPage(driver, test);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLeadPage verifyCompName(String vComp){
		verifyPartialText(eleCompanyName,vComp);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='/crmsfa/control/findLeads']")
	private WebElement eleFindLeads;
	public FindLeadsPage clickFindLeads() throws InterruptedException{
		click(eleFindLeads);
		Thread.sleep(3000);
		return new FindLeadsPage(driver, test);
	}


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadsPage enterFirstName(String fName){
		type(eleFirstName, fName);
		return new FindLeadsPage(driver, test);
	}

	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleEMailTab;
	public FindLeadsPage clickEMailTab(){
		click(eleEMailTab);
		return this;
	}

	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEMail;
	public FindLeadsPage enterEMail(String eMail){
		type(eleEMail, eMail);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsBtn;
	public FindLeadsPage clickFindLeadsBtn() throws InterruptedException {

		click(eleFindLeadsBtn);
		Thread.sleep(2000);
		if(eleVerifyNoRecords.isDisplayed()){
			System.out.println("No records with this name");
			driver.quit();

		}else {
			return this;// this else block return 
		}
		return this;//this method level return
	}


	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	public WebElement eleFirstResult;
	public Object clickFirstResult(Object obj){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(eleFirstResult));

		click(eleFirstResult);

		if(obj.equals(new MergeLeadsPage(driver, test)))
		{
			switchToWindow(0);
			return new MergeLeadsPage(driver, test);

		}
		else if (obj.equals(new ViewLeadPage(driver, test))){

			return new ViewLeadPage(driver, test);
		}else if (obj.equals(new EditLeadPage(driver, test))){

			return new EditLeadPage(driver, test);
		}
		return null;


	}
//}	//this is the issue


@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[6]")
public WebElement eleResult;
public  MergeLeadsPage clickResult(){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(eleFirstResult));
	click(eleResult);
	switchToWindow(0);
	return new MergeLeadsPage(driver, test);
}



@FindBy(how=How.XPATH,using="//input[@name='id']")
private WebElement eleEnterLeadID;
public FindLeadsPage enterLeadID(){
	type(eleEnterLeadID,"" );
	return new FindLeadsPage(driver, test);
}

@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
private WebElement eleVerifyNoRecords;
public FindLeadsPage verifyNoRecordsMessage(){
	System.out.println(getText(eleVerifyNoRecords));
	return new FindLeadsPage(driver, test);
}

}


//@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")
//private WebElement eleFirstResult;
/*public MergeLeadsPage clickFirstResult(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(eleFirstResult));
		click(eleFirstResult);
		return new MergeLeadsPage(driver, test);*/

/*@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")
public WebElement eleFirstResult;
public static String str;
public MergeLeadsPage clickFirstResult(){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(eleFirstResult));
	 str = getText(eleFirstResult);
	click(eleFirstResult);
	switchToWindow(0);
	return new MergeLeadsPage(driver, test);

	}
 */	
/*@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")
private WebElement eleTextOfFirstResult;
public String getFN(){
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(eleTextOfFirstResult));
	String text = getText(eleTextOfFirstResult);
	return text;

}
 */	



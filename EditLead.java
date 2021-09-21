package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods  {

	@BeforeTest
	public void getfilename() {
		Sheetname ="EditLead";
	}
	@Test(dataProvider="getdata")
	public void editLead(String Username,String Password,String editCompanyname) throws InterruptedException {
		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().clickCRMLink().clickMyLead().clickFindLead().enterFirstname()
		.clickFindLeadsButton().clickFirstRecordfromLeadListTable().clickEditButton().editCompanyname(editCompanyname).clickUpdateButton()
		.verifyCompanyName(editCompanyname);
	
	}


}
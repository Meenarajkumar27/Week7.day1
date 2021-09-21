package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead  extends ProjectSpecificMethods {
	@BeforeTest
	public void getfilename() {
		Sheetname ="deleteLead";
	}
	@Test(dataProvider="getdata")
	public void DeleteLead(String Username,String Password,String phonenumber) throws InterruptedException {
		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().clickCRMLink().clickMyLead().clickFindLead()
		.clickPhoneTab().enterPhoneNumber(phonenumber).clickFindLeadsButton().clickFirstRecordfromLeadListTable().clickDeleteButton().clickFindLead()
		.enterLeadID().clickFindLeadsButton().verfiyNoRecordIsDisplayed();
	}

}

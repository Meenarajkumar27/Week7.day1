package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;


public class CreatLead extends ProjectSpecificMethods {
		
	@BeforeTest
	public void getfilename() {
		Sheetname ="CreateLead";
	}
	@Test(dataProvider="getdata")
	public void createLead(String Username,String Password,String fname1,String lastname,String company) {
		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().clickCRMLink().clickMyLead().clickCreateLead()
		.enterFirstName(fname1).enterLastName(lastname)
		.enterCompanyName(company).clicksubmitButton().VerifyCreatedLead();
	}


}
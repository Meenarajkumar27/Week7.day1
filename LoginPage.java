package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage  extends ProjectSpecificMethods{
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUserName(String Username) {
		 driver.findElement(By.id("username")).sendKeys(Username);
		 return this;
		 
	}
	public LoginPage enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		 return this;
	}
	public HomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		 return new HomePage(driver);
	}

}

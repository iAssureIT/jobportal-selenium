package pageEvents;

import base.BaseTest;
import pageObjects.AdminLoginPageElements;
import utils.AdminElementFetch;

public class AdminLoginPageEvents extends BaseTest {
	AdminElementFetch ele=new AdminElementFetch();
	
	public void enterCredentials()
	{
		ele.getWebElement("ID", AdminLoginPageElements.phoneNumber).sendKeys("iassureit.jobportal@gmail.com");
		ele.getWebElement("ID", AdminLoginPageElements.passwordField).sendKeys("iAssureIT@123");
		ele.getWebElement("XPATH", AdminLoginPageElements.loginText).click();
		
	}

}

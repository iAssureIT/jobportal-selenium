package pageEvents;

import base.BaseTest;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents extends BaseTest {
	ElementFetch ele=new ElementFetch();
	
	public void enterCredentials()
	{
		ele.getWebElement("ID", LoginPageElements.phoneNumber).sendKeys("iassureit.jobportal@gmail.com");
		ele.getWebElement("ID", LoginPageElements.passwordField).sendKeys("iAssureIT@123");
		ele.getWebElement("XPATH", LoginPageElements.loginText).click();
		
	}

}

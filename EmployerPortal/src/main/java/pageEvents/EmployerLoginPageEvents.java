package pageEvents;

import pageObjects.EmployerLoginPageElements;
import utils.EmployerElementFetch;

public class EmployerLoginPageEvents {
	EmployerElementFetch ele=new EmployerElementFetch();
	
	public void enterCredentials()
	{
		ele.getWebElement("ID", EmployerLoginPageElements.phoneNumber).sendKeys("1234567891");
		ele.getWebElement("ID", EmployerLoginPageElements.passwordField).sendKeys("123456789");
		ele.getWebElement("XPATH", EmployerLoginPageElements.loginText).click();
	}

}

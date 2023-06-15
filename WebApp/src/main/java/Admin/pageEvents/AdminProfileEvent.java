package pageEvents;

import base.BaseTest;
import pageObjects.AdminProfile;
import utils.ElementFetch;

public class AdminProfileEvent extends BaseTest {
	ElementFetch ele=new ElementFetch();
	
	public void admin()
	{
		ele.getWebElement("XPATH",AdminProfile.profile).click();
		ele.getWebElement("XPATH",AdminProfile.editprofie).click();
		
	}
	

}

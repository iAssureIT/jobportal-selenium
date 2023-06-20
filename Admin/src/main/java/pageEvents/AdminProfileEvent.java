package pageEvents;

import base.BaseTest;
import pageObjects.AdminProfile;
import utils.AdminElementFetch;

public class AdminProfileEvent extends BaseTest {
	AdminElementFetch ele=new AdminElementFetch();
	
	public void admin()
	{
		ele.getWebElement("XPATH",AdminProfile.profile).click();
		ele.getWebElement("XPATH",AdminProfile.editprofie).click();
		
	}
	

}

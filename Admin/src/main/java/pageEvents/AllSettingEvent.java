package pageEvents;

import base.BaseTest;
import pageObjects.AdminAllSettingElement;
import utils.AdminElementFetch;

public class AllSettingEvent extends BaseTest{
	AdminElementFetch ele=new AdminElementFetch();
	public void Allsetting()
	{
		ele.getWebElement("XPATH",AdminAllSettingElement.setting).click();
	}
	

	
	
}

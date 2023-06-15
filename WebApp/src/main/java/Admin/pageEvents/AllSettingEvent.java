package pageEvents;

import base.BaseTest;
import pageObjects.AllSettingElement;
import utils.ElementFetch;

public class AllSettingEvent extends BaseTest{
	ElementFetch ele=new ElementFetch();
	public void Allsetting()
	{
		ele.getWebElement("XPATH",AllSettingElement.setting).click();
	}
	

	
	
}

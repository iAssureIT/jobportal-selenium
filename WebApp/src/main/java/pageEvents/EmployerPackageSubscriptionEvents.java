package pageEvents;

import base.BaseTest;
import pageObjects.EmployerPackageSubscriptionElements;
import utils.EmployerElementFetch;

public class EmployerPackageSubscriptionEvents extends BaseTest{
	EmployerElementFetch ele=new EmployerElementFetch();
	
	public void subscription() {
	
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.Menubar).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.sub).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.SubscriptionButton).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.OkSubscription).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.SelectPackage).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.Subscription).click();
	ele.getWebElement("XPATH", EmployerPackageSubscriptionElements.MakePayment).click();
	driver.navigate().back();
	
	
	
	
	
	
	
		
	}

}

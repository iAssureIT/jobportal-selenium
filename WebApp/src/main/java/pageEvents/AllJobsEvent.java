package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.AdminAllJobsElement;
import utils.AdminElementFetch;

public class AllJobsEvent extends BaseTest{
	AdminElementFetch element=new AdminElementFetch();
	
	public void alljobs()
	{
        element.getWebElement("XPATH",AdminAllJobsElement.jobs).click(); 
 		element.getWebElement("XPATH",AdminAllJobsElement.alljobs ).click();
 		element.getWebElement("XPATH",AdminAllJobsElement.addjob).click();
 		element.getWebElement("XPATH",AdminAllJobsElement.manualbutton).click();
 		
	}
	public void manual()
	{
		Select select=new Select(driver.findElement(By.id("company_id")));
		select.selectByVisibleText("");
		
	}

}

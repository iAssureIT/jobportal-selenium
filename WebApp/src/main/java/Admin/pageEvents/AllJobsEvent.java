package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.AllJobsElement;
import utils.ElementFetch;

public class AllJobsEvent extends BaseTest{
	ElementFetch element=new ElementFetch();
	
	public void alljobs()
	{
         
 		//element.getWebElement("XPATH",AllJobsElement.alljobs ).click();
 		element.getWebElement("XPATH",AllJobsElement.addjob).click();
 		element.getWebElement("XPATH",AllJobsElement.manualbutton).click();
 		
	}
	public void manual()
	{
		Select select=new Select(driver.findElement(By.id("company_id")));
		select.selectByVisibleText("");
		
	}

}

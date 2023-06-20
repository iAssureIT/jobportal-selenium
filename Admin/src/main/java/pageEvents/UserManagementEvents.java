package pageEvents;

import org.openqa.selenium.By;

import base.BaseTest;
import pageObjects.UserManagementElements;

public class UserManagementEvents extends BaseTest{
	
	public void UserManagement()
	{
		//Click on User Management
		driver.findElement(By.xpath(UserManagementElements.UM_List_XPATH)).click();
		
		
	}
	

}

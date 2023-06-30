package pageEvents;


import pageObjects.ProfileElements;
import utils.ElementFetch;

public class ProfileEvents {
	ElementFetch ele=new ElementFetch();
	
	public void profileCredentials()
	{
		ele.getWebElement("XPATH", ProfileElements.profilePicture).click();
		ele.getWebElement("XPATH", ProfileElements.Profile).click();
		ele.getWebElement("ID", ProfileElements.Edit).click();
		//ele.getWebElement("XPATH", ProfileElements.SaveNext).click();
		//ele.getWebElement("XPATH", ProfileElements.Popup).click();
	//	ele.getWebElement("XPATH", ProfileElements.Download).click();
		//ele.getWebElement("XPATH", ProfileElements.Next1).click();
	
		//ele.getWebElement("XPATH", ProfileElements.GridView).click();
		//ele.getWebElement("XPATH", ProfileElements.ListView).click();
		//ele.getWebElement("XPATH", ProfileElements.Print).click();
		//ele.getWebElement("ID", ProfileElements.Download1).click();
		//ele.getWebElement("XPATH", ProfileElements.Next2).click();
		
		
		//Contact
		//ele.getWebElement("XPATH", ProfileElements.AddContact).click();
		//ele.getWebElement("XPATH", ProfileElements.Finish).click();
		//ele.getWebElement("XPATH", ProfileElements.OK).click();
		//ele.getWebElement("XPATH", ProfileElements.AcceptProfile).click();
		//ele.getWebElement("XPATH", ProfileElements.OK1).click();
	}
	
	public void ChangeEmployerContactDetails()
	{
		ele.getWebElement("XPATH", ProfileElements.profilePicture).click();
		ele.getWebElement("XPATH", ProfileElements.Profile).click();
		ele.getWebElement("ID", ProfileElements.Edit).click();
		ele.getWebElement("XPATH",ProfileElements.CompanyPhone).click();
		ele.getWebElement("XPATH",ProfileElements.CompanyPhone).clear();
		
		//ele.getWebElement("XPATH", ProfileElements.CompanyPhone).sendKeys("9145434832");
		//ele.getWebElement("XPATH", ProfileElements.Employercontact).sendKeys("555555555");
		
	}
	
	public void ChangEmployerPassword(String OldPassword,String NewPassword,String ConfirmPassword)
	{
		ele.getWebElement("XPATH", ProfileElements.profilePicture).click();
		
		ele.getWebElement("XPATH", ProfileElements.ResetEmployerPassword).click();
		ele.getWebElement("XPATH",ProfileElements.OldPassword).sendKeys(OldPassword);
		ele.getWebElement("XPATH",ProfileElements.NewPassword).sendKeys(NewPassword);
		ele.getWebElement("XPATH",ProfileElements.ConfirmPassword).sendKeys(ConfirmPassword);
		ele.getWebElement("XPATH",ProfileElements.Resetpasswordbutton).click();
		
		//ele.getWebElement("XPATH", ProfileElements.CompanyPhone).sendKeys("9145434832");
		//ele.getWebElement("XPATH", ProfileElements.Employercontact).sendKeys("555555555");
		
	}

}

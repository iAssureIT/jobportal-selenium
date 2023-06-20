package pageEvents;


import pageObjects.EmployerProfileElements;
import utils.EmployerElementFetch;

public class EmployerProfileEvents {
	EmployerElementFetch ele=new EmployerElementFetch();
	
	public void profileCredentials()
	{
		ele.getWebElement("XPATH", EmployerProfileElements.profilePicture).click();
		ele.getWebElement("XPATH", EmployerProfileElements.Profile).click();
		ele.getWebElement("ID", EmployerProfileElements.Edit).click();
		ele.getWebElement("XPATH", EmployerProfileElements.SaveNext).click();
		ele.getWebElement("XPATH", EmployerProfileElements.Popup).click();
	//	ele.getWebElement("XPATH", ProfileElements.Download).click();
		ele.getWebElement("XPATH", EmployerProfileElements.Next1).click();
	
		ele.getWebElement("XPATH", EmployerProfileElements.GridView).click();
		ele.getWebElement("XPATH", EmployerProfileElements.ListView).click();
		//ele.getWebElement("XPATH", ProfileElements.Print).click();
		//ele.getWebElement("ID", ProfileElements.Download1).click();
		ele.getWebElement("XPATH", EmployerProfileElements.Next2).click();
		
		
		//Contact
		//ele.getWebElement("XPATH", ProfileElements.AddContact).click();
		ele.getWebElement("XPATH", EmployerProfileElements.Finish).click();
		ele.getWebElement("XPATH", EmployerProfileElements.OK).click();
		ele.getWebElement("XPATH", EmployerProfileElements.AcceptProfile).click();
		ele.getWebElement("XPATH", EmployerProfileElements.OK1).click();
	}

}

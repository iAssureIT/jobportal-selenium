package Test;

import org.testng.annotations.Test;

import pageEvents.AdminEmployerDetailsEvents;
import utils.AdminElementFetch;

public class AdminEmployerDetailsTestcase {
	AdminElementFetch ele=new AdminElementFetch();
	AdminEmployerDetailsEvents ls=new AdminEmployerDetailsEvents();
	
	@Test
	public void enteringEmployerDetails() throws InterruptedException
	{
		ls.details();
	}

}
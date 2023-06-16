package Test;

import org.testng.annotations.Test;

import pageEvents.EmployerDetailsEvents;
import utils.AdminElementFetch;

public class AdminEmployerDetailsTestcase {
	AdminElementFetch ele=new AdminElementFetch();
	EmployerDetailsEvents ls=new EmployerDetailsEvents();
	
	@Test
	public void enteringEmployerDetails() throws InterruptedException
	{
		ls.details();
	}

}
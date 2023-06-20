package Test;

import org.testng.annotations.Test;

import pageEvents.EmployerDetailsEvents;
import utils.EmployerElementFetch;

public class EmployerDetailsTestcase {
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerDetailsEvents ls=new EmployerDetailsEvents();
	
	@Test
	public void enteringEmployerDetails() throws InterruptedException
	{
		ls.details();
	}

}

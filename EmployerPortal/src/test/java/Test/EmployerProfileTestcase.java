package Test;

import org.testng.annotations.Test;

import pageEvents.EmployerProfileEvents;
import utils.EmployerElementFetch;

public class EmployerProfileTestcase {
	EmployerElementFetch ele= new EmployerElementFetch();
	EmployerProfileEvents profileevents=new EmployerProfileEvents();
	
	@Test
	public void profileDetalis()
	{
		profileevents.profileCredentials();
	}
	

}

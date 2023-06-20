package Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.AllJobsEvent;
import utils.AdminElementFetch;

public class AdminAllJobsTest extends BaseTest{
	
	AdminElementFetch element=new AdminElementFetch();
	AllJobsEvent event=new AllJobsEvent();
	
	@Test
	
	public void samleMethodForAllJob()
	{
		event.alljobs();
		
	}

}

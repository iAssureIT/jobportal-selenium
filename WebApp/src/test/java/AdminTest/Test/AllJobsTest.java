package qa.Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.AllJobsEvent;
import utils.ElementFetch;

public class AllJobsTest extends BaseTest{
	
	ElementFetch element=new ElementFetch();
	AllJobsEvent event=new AllJobsEvent();
	
	@Test
	
	public void samleMethodForAllJob()
	{
		event.alljobs();
		
	}

}

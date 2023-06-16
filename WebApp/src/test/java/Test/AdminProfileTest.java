package Test;

import org.testng.annotations.Test;

import pageEvents.AdminProfileEvent;
import utils.AdminElementFetch;

public class AdminProfileTest {
	AdminElementFetch element=new AdminElementFetch();
	AdminProfileEvent admin=new AdminProfileEvent();
	@Test
	public void sapleadminmethod()
	{
		admin.admin();
	}
	
}

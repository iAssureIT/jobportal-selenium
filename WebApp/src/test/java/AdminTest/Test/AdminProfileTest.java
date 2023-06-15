package qa.Test;

import org.testng.annotations.Test;

import pageEvents.AdminProfileEvent;
import utils.ElementFetch;

public class AdminProfileTest {
	ElementFetch element=new ElementFetch();
	AdminProfileEvent admin=new AdminProfileEvent();
	@Test
	public void sapleadminmethod()
	{
		admin.admin();
	}
	
}

package qa.Test;

import org.testng.annotations.Test;

import pageEvents.ProfileEvents;
import utils.ElementFetch;

public class ResetEmployerPasswordTestcase {
	
	ElementFetch el = new ElementFetch();
	ProfileEvents pi = new ProfileEvents();
	
	@Test
	public void ResetEmployerPassword()
	{
		pi.ChangEmployerPassword("NewPassword","123456789","123456789");
	}
	

}

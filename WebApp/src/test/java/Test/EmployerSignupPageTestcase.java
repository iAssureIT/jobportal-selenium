package Test;

import org.testng.annotations.Test;

import base.*;
import pageEvents.EmployerSignupPageEvents;
import utils.EmployerElementFetch;

public class EmployerSignupPageTestcase extends BaseTest{
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerSignupPageEvents signup=new EmployerSignupPageEvents();
	
	@Test
	public void enteringCredentialsForSifnUp() throws InterruptedException
	{
		signup.enterCredentialsSignUp();;
	}
	
}

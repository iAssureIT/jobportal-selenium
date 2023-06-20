package Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.EmployerLoginPageEvents;
import utils.EmployerElementFetch;

public class EmployerLoginPageTestcase extends BaseTest {
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerLoginPageEvents loginpage=new EmployerLoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	 
	  loginpage.enterCredentials();
	  
  }
}

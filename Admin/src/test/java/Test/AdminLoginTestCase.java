package Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.AdminLoginPageEvents;
import utils.AdminElementFetch;

public class AdminLoginTestCase extends BaseTest {
	AdminElementFetch ele=new AdminElementFetch();
	AdminLoginPageEvents loginpage=new AdminLoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	  
	  loginpage.enterCredentials();
	  
  }
}

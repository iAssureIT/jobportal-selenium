package Test;

import org.testng.annotations.Test;

import base.AdminSettings;
import base.BaseTest;
import pageEvents.UserManagementEvents;

public class AdminUserManagementTest extends BaseTest {
	
	AdminSettings AS = new AdminSettings();
	UserManagementEvents UM =  new UserManagementEvents();
  @Test
  public void f() {
	  setupDriver("Chrome");
	  AS.AdminSetting();
	  UM.UserManagement();
	  
  }
}

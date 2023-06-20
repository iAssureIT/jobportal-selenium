package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageEvents.AdminMasterData;
import utils.AdminElementFetch;

public class AdminMasterDataTest extends AdminLoginTestCase {
	
	AdminElementFetch ele=new AdminElementFetch();
	AdminMasterData MasterData = new AdminMasterData();
  @Test
  public void f() {
	 
	  MasterData.AdminFullMasterData();
  }
}

package Test;

import org.testng.annotations.Test;

import pageEvents.AdminMasterData;
import utils.AdminElementFetch;

public class AdminMasterDataTest  {
	
	AdminElementFetch ele=new AdminElementFetch();
	AdminMasterData MasterData = new AdminMasterData();
  @Test
  public void f() {
	  
	  MasterData.AdminFullMasterData();
  }
}

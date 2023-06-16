package Test;

import org.testng.annotations.Test;

import base.*;
import pageEvents.AdminPostJobEvent;
import utils.AdminElementFetch;

public class AdminPostJobTestCase extends BaseTest {
	AdminElementFetch ele=new AdminElementFetch();
	AdminPostJobEvent postjob=new AdminPostJobEvent();
	
  @Test
  public void sampledataenter() throws InterruptedException {
	  
       postjob.enterdata();
  }
}
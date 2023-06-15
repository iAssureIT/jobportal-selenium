package qa.Test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.PostJobEvent;
import utils.ElementFetch;

public class PostJobTestCase extends BaseTest {
	ElementFetch ele=new ElementFetch();
	PostJobEvent postjob=new PostJobEvent();
	
  @Test
  public void sampledataenter() throws InterruptedException {
	  
       postjob.enterdata();
  }
}
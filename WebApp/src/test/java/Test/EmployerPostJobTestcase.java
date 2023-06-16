package Test;

import org.testng.annotations.Test;

import pageEvents.EmployerPostJobEvents;
import utils.EmployerElementFetch;

public class EmployerPostJobTestcase {
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerPostJobEvents post=new EmployerPostJobEvents ();
	@Test
	public void postjobCredentials()
	{
		try {
			post.jobPost();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

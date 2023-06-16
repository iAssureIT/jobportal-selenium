package Test;

import pageEvents.EmployerPostedJobEvents;
import utils.EmployerElementFetch;

public class EmployerPostedJobTestcase {
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerPostedJobEvents events=new EmployerPostedJobEvents();
	
	public void posted()
	{
		try {
			events.PostedJobActive();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
			

}

package Test;

import org.testng.annotations.Test;

import pageEvents.EmployerPackageSubscriptionEvents;
import utils.EmployerElementFetch;

public class EmployerPackageSubscriptionTestcase {
	EmployerElementFetch ele=new EmployerElementFetch();
	EmployerPackageSubscriptionEvents packagesubscription=new EmployerPackageSubscriptionEvents();
	
	@Test
	public void subscriptionDetails() {
		packagesubscription.subscription();
		
	}

}

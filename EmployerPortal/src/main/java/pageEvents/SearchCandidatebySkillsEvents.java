package pageEvents;

import pageObjects.EmployerMenuElements;
import utils.ElementFetch;

public class SearchCandidatebySkillsEvents implements EmployerMenuElements{
	
	ElementFetch ele = new ElementFetch();
	
	public void SearchCandidatebyskill()
	{
		ele.getWebElement("XPATH", EmployerMenuElements.Menubar).click();
		ele.getWebElement("XPATH", EmployerMenuElements.ClickSearchCandidate).click();
		ele.getWebElement("xpath", EmployerMenuElements.ClickonSkillFilter).click();;
		
		
	}
	
	
	
	//EmployerMenuElements empmenu = new EmployerMenuElements();
	
	

}

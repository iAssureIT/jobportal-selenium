package qa.Test;

import org.testng.annotations.Test;

import pageEvents.SearchCandidatebySkillsEvents;
import pageEvents.SearchCandidatesEvents;
import pageObjects.EmployerMenuElements;
import utils.ElementFetch;

public class SearchCandidatebySkillTestcase {

	ElementFetch ele=new ElementFetch();
	SearchCandidatebySkillsEvents src = new SearchCandidatebySkillsEvents();
	
	
	@Test
	public void SearchcandidatebySkills()
	{
		src.SearchCandidatebyskill();
	}
	
	
}

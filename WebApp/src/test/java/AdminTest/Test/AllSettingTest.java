package qa.Test;

import org.testng.annotations.Test;

import pageEvents.AllSettingEvent;
import utils.ElementFetch;

public class AllSettingTest {

	ElementFetch element=new ElementFetch();
	AllSettingEvent allsetting=new AllSettingEvent();
	@Test
	
	public void samplesettingmethod()
	{
		allsetting.Allsetting();
	}
}

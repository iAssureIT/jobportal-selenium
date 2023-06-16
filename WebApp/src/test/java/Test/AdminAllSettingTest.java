package Test;

import org.testng.annotations.Test;

import pageEvents.AllSettingEvent;
import utils.AdminElementFetch;

public class AdminAllSettingTest {

	AdminElementFetch element=new AdminElementFetch();
	AllSettingEvent allsetting=new AllSettingEvent();
	@Test
	
	public void samplesettingmethod()
	{
		allsetting.Allsetting();
	}
}

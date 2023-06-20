package base;

import org.openqa.selenium.By;

public class AdminSettings extends BaseTest {
	
	public void AdminSetting()
	{
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/header/nav/div[2]/div[1]/i")).click();
		
	}

}

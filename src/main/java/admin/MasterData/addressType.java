package admin.MasterData;

import org.openqa.selenium.By;

public class addressType extends baseClassForAdmin {

	public void AddressType()
	{

	
		// Find the Element
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/aside/section/ul/li[5]/a/span")).click();

		
		
	}
}

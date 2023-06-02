package admin.MasterData;

import org.openqa.selenium.By;

public class login extends baseClassForAdmin{
	
		public void loginToAdmin() throws InterruptedException
		{ 
			// Login
			Thread.sleep(3000);
			driver.findElement(By.name("loginusername")).sendKeys("iassureit.jobportal@gmail.com");
			driver.findElement(By.id("password")).sendKeys("iAssureIT@123");
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[4]/button")).click();
			
			
			
		}
		

}

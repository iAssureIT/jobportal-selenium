package admin.MasterData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClassForAdmin {
	
	public static WebDriver	driver;
	
	public void launchBrowser(String browser)
	{
		switch (browser)
		{
		case "Firefox" :
			driver = new FirefoxDriver();
			break;
			
		case "Chrome" :
			driver = new ChromeDriver();
			break;
			
		case "MS Edge" :
			driver = new EdgeDriver();
			break;  
<<<<<<< Updated upstream
			        }
=======
			driver.get("https://qaadmin-iassureit-jobportal.iassureit.in/");
        }
>>>>>>> Stashed changes
	
		
	}
	
}

package pageEvents;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.AdminEmployerDetailsElements;
import pageObjects.AdminEmployerDetailsElements;
import utils.AdminElementFetch;
import utils.AdminElementFetch;

public class AdminEmployerDetailsEvents extends BaseTest  {
	AdminElementFetch ele=new AdminElementFetch();
	
	public void details() throws InterruptedException{
	//ele.getWebElement("Xpath", EmployerDetailsElements.Menu).click();
	//ele.getWebElement("XPATH", EmployerDetailsElements.Setting).click();
	//ele.getWebElement("CLASSNAME", EmployerDetailsElements.BasicInfo).click();
	ele.getWebElement("ID", AdminEmployerDetailsElements.CompanyName).sendKeys("Tata Consaltancy Services");
	ele.getWebElement("ID", AdminEmployerDetailsElements.GroupName).sendKeys("TATA");
	ele.getWebElement("ID", AdminEmployerDetailsElements.Industry).sendKeys("IT");
	ele.getWebElement("ID", AdminEmployerDetailsElements.email).sendKeys("career@tcs.com");
	ele.getWebElement("ID", AdminEmployerDetailsElements.CompanyNumber).sendKeys("8888642631");
	ele.getWebElement("ID", AdminEmployerDetailsElements.Website).sendKeys("www.tcs.com");
	//ele.getWebElement("ID", EmployerDetailsElements.Country).click();
	Thread.sleep(1000);
	WebElement element=driver.findElement(By.id("country"));
	Select c=new Select(element);
	c.selectByVisibleText("India");
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.Next).click();
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.button).click();
	
	//Add Statutory
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.addstatutory).click();
	WebElement country=driver.findElement(By.id("states"));
	Select s1=new Select(country);
	s1.selectByVisibleText("Maharashtra");
	ele.getWebElement("ID", AdminEmployerDetailsElements.gstinno).sendKeys("27AAAAP0267H2ZN");
	ele.getWebElement("ID", AdminEmployerDetailsElements.pan).sendKeys("SDFGH4567K");
	//ele.getWebElement("XPATH", EmployerDetailsElements.sub).click();
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.next).click();
	ele.getWebElement("XPATH",AdminEmployerDetailsElements.button1).click();
 
	//Location
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.AddLocation).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement location=driver.findElement(By.id("locationType"));
	Select s=new Select(location);
	s.selectByVisibleText("Office");
	
	ele.getWebElement("ID", AdminEmployerDetailsElements.AddressLine).sendKeys("Hinjewadi Phase 1 Road, Phase 1, Hinjawadi Rajiv Gandhi Infotech Park, Hinjawadi, Pimpri-Chinchwad, Maharashtra, India");
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.submit).click();
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.nxt).click();
	ele.getWebElement("XPATH", AdminEmployerDetailsElements.okbutton).click();
	//contact
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.AddContact).click();
		Thread.sleep(1000);
		WebElement dept=driver.findElement(By.id("deptName"));
		Select c1=new Select(dept);
		c1.selectByVisibleText("Operations");
		
		Thread.sleep(1000);
		WebElement desg=driver.findElement(By.id("desgName"));
		Select s3=new Select(desg);
		s3.selectByVisibleText("Intern");
		
		ele.getWebElement("ID", AdminEmployerDetailsElements.EmployeeID).sendKeys("A13");
		ele.getWebElement("ID", AdminEmployerDetailsElements.FName).sendKeys("Raju");
		ele.getWebElement("ID", AdminEmployerDetailsElements.LName).sendKeys("Sharma");
		ele.getWebElement("ID", AdminEmployerDetailsElements.mail).sendKeys("rajusharma@gmail.com");
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.yes).click();
		

		Thread.sleep(1000);
		WebElement rol=driver.findElement(By.id("role"));
		Select r=new Select(rol);
		r.selectByVisibleText("employer");
		
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.submit5).click();
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.Finish).click();
		
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.Ok).click();
		
		ele.getWebElement("XPATH", AdminEmployerDetailsElements.ok1).click();
	}
}
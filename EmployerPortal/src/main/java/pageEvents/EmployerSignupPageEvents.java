package pageEvents;

import org.openqa.selenium.Alert;

import base.BaseTest;
import pageObjects.EmployerSignupPageElements;
import utils.EmployerElementFetch;

public class EmployerSignupPageEvents extends BaseTest {
EmployerElementFetch ele=new EmployerElementFetch();
	
	public void enterCredentialsSignUp() throws InterruptedException
	{
		ele.getWebElement("CLASSNAME", EmployerSignupPageElements.SignUpText).click();
		ele.getWebElement("ID", EmployerSignupPageElements.CompanyName).sendKeys("TATA");
		ele.getWebElement("NAME", EmployerSignupPageElements.Branch).sendKeys("Shivajinagar,Pune");
		ele.getWebElement("ID", EmployerSignupPageElements.State).sendKeys("Maharashtra");
		ele.getWebElement("ID", EmployerSignupPageElements.Country ).sendKeys("India");
		ele.getWebElement("XPATH", EmployerSignupPageElements.Next).click();
		
		
		ele.getWebElement("ID", EmployerSignupPageElements.FirstName).sendKeys("Nilisha");
		ele.getWebElement("ID", EmployerSignupPageElements.LastName).sendKeys("Raut");
		ele.getWebElement("ID", EmployerSignupPageElements.Email).sendKeys("iassureit.jobportal@gmail.com");
		ele.getWebElement("ID", EmployerSignupPageElements.PhoneNo).sendKeys("9130173552");
		ele.getWebElement("ID", EmployerSignupPageElements.Password).sendKeys("iAssureIT@123");
		ele.getWebElement("ID", EmployerSignupPageElements.ConfirmPassword).sendKeys("iAssureIT@123");
		ele.getWebElement("ID", EmployerSignupPageElements.CheckBox).click();
		ele.getWebElement("XPATH", EmployerSignupPageElements.Nxt).click();
		
		Alert simpleAlert=driver.switchTo().alert(); 
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000); 
		simpleAlert.accept();
		
	}

}

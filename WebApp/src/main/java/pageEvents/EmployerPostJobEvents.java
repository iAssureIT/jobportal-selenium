package pageEvents;

import base.BaseTest;
import pageObjects.EmployerPostJobElements;
import utils.EmployerElementFetch;

public class EmployerPostJobEvents extends BaseTest {
	EmployerElementFetch ele = new EmployerElementFetch();

	public void jobPost() throws InterruptedException {
		ele.getWebElement("XPATH", EmployerPostJobElements.postjob).click();
		
		  //Basic Info 
		ele.getWebElement("ID",EmployerPostJobElements.JobTitle).sendKeys("QA Engineer"); 
		ele.getWebElement("XPATH", EmployerPostJobElements.Address).sendKeys("Rajiv Gandhi Infotech Park, Phase 3, Hinjawadi Rajiv Gandhi Infotech Park, Hinjawadi, Pimpri-Chinchwad, Maharashtra, India" );
		 
		ele.getWebElement("ID", EmployerPostJobElements.Functional).sendKeys("IT Service");
		ele.getWebElement("ID",EmployerPostJobElements.SubFunctional).sendKeys("Software Development");
		ele.getWebElement("ID", EmployerPostJobElements.Role).sendKeys("Tester");
		ele.getWebElement("XPATH", EmployerPostJobElements.WhoCanApply).click();
		ele.getWebElement("XPATH", EmployerPostJobElements.WFH).click();
		  
		ele.getWebElement("ID", EmployerPostJobElements.JobSector).sendKeys("Private");
		ele.getWebElement("ID", EmployerPostJobElements.JobType).sendKeys("Remote");
		ele.getWebElement("ID", EmployerPostJobElements.JobTime).sendKeys("Full Time");
		ele.getWebElement("ID", EmployerPostJobElements.JobShift).sendKeys("Day Shift");
		ele.getWebElement("ID", EmployerPostJobElements.NoofPositions).sendKeys("5");
		  
		 //Salary 
		ele.getWebElement("ID", EmployerPostJobElements.MinSal).sendKeys("500000");
		ele.getWebElement("ID", EmployerPostJobElements.Min).click();;
		ele.getWebElement("ID", EmployerPostJobElements.MaxSal).sendKeys("700000");
		ele.getWebElement("ID", EmployerPostJobElements.Max).click();
		 
		 //Required Education and Experience 
		ele.getWebElement("ID",EmployerPostJobElements.MinEdu).sendKeys("BE");
		ele.getWebElement("ID",EmployerPostJobElements.MinOverallEx).sendKeys("3");
		  
		 //Expected Skills
		 
		/* WebElement elem=driver.findElement(By.xpath("//*[@id=\"allSkills\"]/div[1]")); 
		 Select select=new Select(elem);
		 select.selectByIndex(0); select.selectByIndex(1);
		 select.selectByIndex(4); select.selectByIndex(6);
		  
		 List<WebElement> listOfoptions = select.getAllSelectedOptions(); for
		  (WebElement obj: listOfoptions) { System.out.println(obj.getText()); }
		 */
		  
		 ele.getWebElement("XPATH", EmployerPostJobElements.PrimarySkills).sendKeys("Java");
		 ele.getWebElement("ID", EmployerPostJobElements.MinEx1).sendKeys("3");
		 ele.getWebElement("ID", EmployerPostJobElements.MinEx2).sendKeys("3");
		 ele.getWebElement("ID", EmployerPostJobElements.MinEx3).sendKeys("3");
		 ele.getWebElement("XPATH", EmployerPostJobElements.NotMandatory).sendKeys("C");
		 
		  
		  //Contact Info 
		 ele.getWebElement("ID", EmployerPostJobElements.ContactPerson).sendKeys("Hr.Mukta"); 
		 ele.getWebElement("ID",EmployerPostJobElements.Email).sendKeys("hr@iassureit.com"); 
		 ele.getWebElement("ID", EmployerPostJobElements.PhoneNo).sendKeys("9822812846");
		  
		 //Job Description 
		 ele.getWebElement("XPATH", EmployerPostJobElements.JobDescription).sendKeys("Hello");
		 
		 ele.getWebElement("XPATH", EmployerPostJobElements.Preview).click();
		 ele.getWebElement("XPATH", EmployerPostJobElements.Close).click();
		 ele.getWebElement("XPATH", EmployerPostJobElements.Publish).click();
		 
		 
		
	}
}

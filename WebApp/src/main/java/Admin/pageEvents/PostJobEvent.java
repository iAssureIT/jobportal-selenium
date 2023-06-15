package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.PostJobElement;
import utils.ElementFetch; 

public class PostJobEvent extends BaseTest{
	ElementFetch ele=new ElementFetch();
	public void enterdata() throws InterruptedException
	{
		Select drpcompany=new Select(driver.findElement(By.id("companyname")));
		drpcompany.selectByVisibleText("iaSuure");
		ele.getWebElement("ID", PostJobElement.jobtitle).sendKeys("Sr.Quality Analyst");
		ele.getWebElement("ID", PostJobElement.location).sendKeys("Cerebrum IT park B3,Near marigold complex, kalyani nagar ,Pune");
		ele.getWebElement("ID", PostJobElement.functionalarea).sendKeys("IT department");
		ele.getWebElement("ID", PostJobElement.subfunctional).sendKeys("Software Test Engineer");
		ele.getWebElement("ID", PostJobElement.role).sendKeys("QA");
		Select jobtype=new Select(driver.findElement(By.id("jobtype")));
		jobtype.selectByValue("Female Only");
		ele.getWebElement("ID",PostJobElement.wfh).click();
		ele.getWebElement("ID", PostJobElement.jobsector).sendKeys("Day Shift");
		ele.getWebElement("ID",PostJobElement.JobType).sendKeys("FullTime");
		ele.getWebElement("ID", PostJobElement.jobtime).sendKeys("FullTime");
		ele.getWebElement("ID", PostJobElement.jobshift).sendKeys("DayShift");
		ele.getWebElement("ID", PostJobElement.jobposition).sendKeys("2");
		//Find the date time picker control

        WebElement dateBox = driver.findElement(By.id("lastDateOfAppl"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("14022013");

        ele.getWebElement("ID", PostJobElement.minsalary).sendKeys("100000");
		ele.getWebElement("ID", PostJobElement.maxsalary).sendKeys("300000");
		
		ele.getWebElement("ID", PostJobElement.mineducation).sendKeys("BE");
		ele.getWebElement("ID", PostJobElement.minexp).sendKeys("2");
		Select drpskills=new Select(driver.findElement(By.xpath("//*[@id=\\\"primarySkills\\\"]/div[1]")));
		drpskills.selectByVisibleText("Java");
		ele.getWebElement("ID", PostJobElement.minprimexp).sendKeys("2");
		Select secondarykills=new Select(driver.findElement(By.id("secondarySkills")));
		secondarykills.selectByVisibleText("Java Script");
		ele.getWebElement("ID", PostJobElement.minotherexp).sendKeys("1");
		
		ele.getWebElement("ID", PostJobElement.personname).sendKeys("HR");
		ele.getWebElement("ID", PostJobElement.personemail).sendKeys("hr@iassureit.com");
		ele.getWebElement("XPATH", PostJobElement.phone).sendKeys("9834444701");
		ele.getWebElement("XPATH", PostJobElement.desc).sendKeys("This is the testing part");
		ele.getWebElement("XPATH", PostJobElement.publish).click();

		
	}

		}


	

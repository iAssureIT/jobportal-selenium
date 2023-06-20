package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import pageObjects.AdminPostJobElement;
import utils.AdminElementFetch; 

public class AdminPostJobEvent extends BaseTest{
	AdminElementFetch ele=new AdminElementFetch();
	public void enterdata() throws InterruptedException
	{
		Select drpcompany=new Select(driver.findElement(By.id("companyname")));
		drpcompany.selectByVisibleText("iaSuure");
		ele.getWebElement("ID", AdminPostJobElement.jobtitle).sendKeys("Sr.Quality Analyst");
		ele.getWebElement("ID", AdminPostJobElement.location).sendKeys("Cerebrum IT park B3,Near marigold complex, kalyani nagar ,Pune");
		ele.getWebElement("ID", AdminPostJobElement.functionalarea).sendKeys("IT department");
		ele.getWebElement("ID", AdminPostJobElement.subfunctional).sendKeys("Software Test Engineer");
		ele.getWebElement("ID", AdminPostJobElement.role).sendKeys("QA");
		Select jobtype=new Select(driver.findElement(By.id("jobtype")));
		jobtype.selectByValue("Female Only");
		ele.getWebElement("ID",AdminPostJobElement.wfh).click();
		ele.getWebElement("ID", AdminPostJobElement.jobsector).sendKeys("Day Shift");
		ele.getWebElement("ID",AdminPostJobElement.JobType).sendKeys("FullTime");
		ele.getWebElement("ID", AdminPostJobElement.jobtime).sendKeys("FullTime");
		ele.getWebElement("ID", AdminPostJobElement.jobshift).sendKeys("DayShift");
		ele.getWebElement("ID", AdminPostJobElement.jobposition).sendKeys("2");
		//Find the date time picker control

        WebElement dateBox = driver.findElement(By.id("lastDateOfAppl"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("14022013");

        ele.getWebElement("ID", AdminPostJobElement.minsalary).sendKeys("100000");
		ele.getWebElement("ID", AdminPostJobElement.maxsalary).sendKeys("300000");
		
		ele.getWebElement("ID", AdminPostJobElement.mineducation).sendKeys("BE");
		ele.getWebElement("ID", AdminPostJobElement.minexp).sendKeys("2");
		Select drpskills=new Select(driver.findElement(By.xpath("//*[@id=\\\"primarySkills\\\"]/div[1]")));
		drpskills.selectByVisibleText("Java");
		ele.getWebElement("ID", AdminPostJobElement.minprimexp).sendKeys("2");
		Select secondarykills=new Select(driver.findElement(By.id("secondarySkills")));
		secondarykills.selectByVisibleText("Java Script");
		ele.getWebElement("ID", AdminPostJobElement.minotherexp).sendKeys("1");
		
		ele.getWebElement("ID", AdminPostJobElement.personname).sendKeys("HR");
		ele.getWebElement("ID", AdminPostJobElement.personemail).sendKeys("hr@iassureit.com");
		ele.getWebElement("XPATH", AdminPostJobElement.phone).sendKeys("9834444701");
		ele.getWebElement("XPATH", AdminPostJobElement.desc).sendKeys("This is the testing part");
		ele.getWebElement("XPATH", AdminPostJobElement.publish).click();

		
	}

		}


	

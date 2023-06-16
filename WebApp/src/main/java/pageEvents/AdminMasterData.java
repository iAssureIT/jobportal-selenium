package pageEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.BaseTest;
import pageObjects.AdminLoginPageElements;
import pageObjects.AdminMasterDataElements;
import utils.AdminElementFetch;


public class AdminMasterData extends BaseTest{
	AdminElementFetch ele=new AdminElementFetch();
	public void AdminFullMasterData()
	{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Click Master Data option
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/aside/section/ul/li[5]/a/span")).click();
	 
		// Address Type
		
		driver.findElement(By.id(AdminMasterDataElements.AddressField)).sendKeys("Temporary Address");
		driver.findElement(By.xpath(AdminMasterDataElements.AddressSubmit)).click();
		
		// Navigate back to page
		driver.navigate().to("https://qaadmin-iassureit-jobportal.iassureit.in/project-master-data");
		
		// Industry
		
		driver.findElement(By.xpath(AdminMasterDataElements.IndustryOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.IndustryField)).sendKeys("Marketing");
		driver.findElement(By.xpath(AdminMasterDataElements.IndustrySubmit)).click();
		
		//Navigate back to page
		driver.navigate().to("https://qaadmin-iassureit-jobportal.iassureit.in/project-master-data");	
		
		//Functional Area
		driver.findElement(By.xpath(AdminMasterDataElements.FuncAreaOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.FuncAreaField)).sendKeys("Marketing");
		driver.findElement(By.xpath(AdminMasterDataElements.FuncAreaSubmit)).click();
		
		
		//Navigate back to page
		//driver.navigate().to("https://qaadmin-iassureit-jobportal.iassureit.in/project-master-data");	
				
		//Sub-Functional Area
		//driver.findElement(By.xpath(AdminMasterDataElements.SubFuncAreaOption)).click();
		//Thread.sleep(3000);
		//driver.findElement(By.id(AdminMasterDataElements.SubFuncAreaField)).sendKeys("Marketing");
		//driver.findElement(By.xpath(AdminMasterDataElements.SubFuncAreaSubmit)).click();
	
		//Navigate back to page
		driver.navigate().to("https://qaadmin-iassureit-jobportal.iassureit.in/project-master-data");	
						
		//Job Sector
		driver.findElement(By.xpath(AdminMasterDataElements.JobSectorOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.JobSectorField)).sendKeys("Goverment");
		driver.findElement(By.xpath(AdminMasterDataElements.JobSectorSubmit)).click();
		
		
		//Job Type
		driver.findElement(By.xpath(AdminMasterDataElements.JobTypeOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.JobTypeField)).sendKeys("Contractual");
		driver.findElement(By.xpath(AdminMasterDataElements.JobTypeSubmit)).click();
		
		//Job Time
		driver.findElement(By.xpath(AdminMasterDataElements.JobTimeOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.JobTimeField)).sendKeys("6 to 12");
		driver.findElement(By.xpath(AdminMasterDataElements.JobTimeSubmit)).click();
		
		//Job Shift
		driver.findElement(By.xpath(AdminMasterDataElements.JobShiftOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.JobShiftField)).sendKeys("Early Morning");
		driver.findElement(By.xpath(AdminMasterDataElements.JobShiftSubmit)).click();
		
		//Job Role
		driver.findElement(By.xpath(AdminMasterDataElements.JobRoleOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.JobRoleField)).sendKeys("ZM");
		driver.findElement(By.xpath(AdminMasterDataElements.JobRoleSubmit)).click();
		
		//Qualification Level
		driver.findElement(By.xpath(AdminMasterDataElements.QualificationLevelOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.QualificationLevelField)).sendKeys("MBA");
		driver.findElement(By.xpath(AdminMasterDataElements.QualificationLevelSubmit)).click();
		
		//Qualification
		driver.findElement(By.xpath(AdminMasterDataElements.QualificationOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.QualificationField)).sendKeys("Engineering");
		driver.findElement(By.xpath(AdminMasterDataElements.QualificationSubmit)).click();
		
		//University
		driver.findElement(By.xpath(AdminMasterDataElements.UniversityOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.UniversityField)).sendKeys("Indore University");
		driver.findElement(By.xpath(AdminMasterDataElements.UniversitySubmit)).click();
		
		//College
		driver.findElement(By.xpath(AdminMasterDataElements.CollegeOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.CollegeField)).sendKeys("JNU");
		driver.findElement(By.xpath(AdminMasterDataElements.CollegeSubmit)).click();
		
		//Language
		driver.findElement(By.xpath(AdminMasterDataElements.LanguageOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.LanguageField)).sendKeys("Dogri");
		driver.findElement(By.xpath(AdminMasterDataElements.LanguageSubmit)).click();
		
		//Skills
		driver.findElement(By.xpath(AdminMasterDataElements.SkillsOption)).click();
		driver.findElement(By.id(AdminMasterDataElements.SkillsField)).sendKeys("core Java");
		driver.findElement(By.xpath(AdminMasterDataElements.SkillsSubmit)).click();
		
		//Package
		//driver.findElement(By.xpath(AdminMasterDataElements.PackageOption)).click();
		//driver.findElement(By.id(AdminMasterDataElements.PackageField)).sendKeys("");
		//driver.findElement(By.xpath(AdminMasterDataElements.PackageSubmit)).click();
			
	
	
	
	}

		
	}
	


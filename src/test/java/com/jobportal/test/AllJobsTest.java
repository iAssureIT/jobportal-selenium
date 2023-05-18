package com.jobportal.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jonportal.pages.EmployerLoginPage;
import com.jonportal.pages.BaseClass;

public class AllJobsTest extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.navigate().to("https://qaadmin-iassureit-jobportal.iassureit.in/#");
		Thread.sleep(4000);
		EmployerLoginPage adminlogin=new EmployerLoginPage();
		adminlogin.login("iassureit.jobportal@gmail.com", "iAssureIT@123");
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/aside/section/ul/li[2]/a"));
		element.click();
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/aside/section/ul/li[2]/ul/li[1]/a"));
		e1.click();
		
	
		
	}
	

}

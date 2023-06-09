package com.jobportal.test;

import com.jonportal.pages.EmployerLoginPage;

import org.testng.annotations.Test;

import com.jonportal.pages.BaseClass;

public class EmployerLoginTests extends BaseClass{
@Test
	public  void beforemethod() throws InterruptedException {
		launchBrowser("chrome");
		driver.navigate().to("https://qaemployer-iassureit-jobportal.iassureit.in/");
		Thread.sleep(4000);
		
		EmployerLoginPage employerlogin=new EmployerLoginPage();
		employerlogin.login("9730531712", "Nilisha@123");	
	}

}

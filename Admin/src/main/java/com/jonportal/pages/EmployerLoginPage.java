package com.jonportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class EmployerLoginPage  extends BaseClass{
	public void login(String phoneNo,String password)

	{   
		WebElement userID=driver.findElement(By.id("phone-form-control"));
	    userID.clear();
		userID.sendKeys(phoneNo);
		
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys(password);
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@class='btn col-lg-6 buttonSignIn']"));
		loginbtn.click();
		
		
		
		
	}
	
}

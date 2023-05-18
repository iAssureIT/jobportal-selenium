package com.jonportal.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static void launchBrowser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			 driver=new ChromeDriver();
		break;
		
		case "Mozilla":
			 driver=new FirefoxDriver();
		break;
		
		case "Edge":
			driver=new EdgeDriver();
		break;
		
		case"default":
			driver=new ChromeDriver();
		
		
		}
		driver.manage().window().maximize();
	
	}
	public static void selectDropdownValByText(final WebElement element, final String text) {
		
	Select select=new Select(element);
	select.selectByVisibleText(text);
		
	}
	public static void Click(By by,String msg)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
		System.out.println(msg);
	}
		protected static void selectDropdownByText(WebElement element,String text) 
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	}



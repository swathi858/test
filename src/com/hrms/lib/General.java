package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.utility.Log;

import org.openqa.selenium.firefox.FirefoxDriver;
public class General extends Global {
public void openApplication()
{
	System.setProperty("webdriver.firefox.driver","G:\\geckodriver.exe");
 driver=new FirefoxDriver();
	driver.navigate().to(url);
	Reporter.log("application opened");
	Log.info("application opened");
}
public void closeApplication()
{
	driver.close();
	Reporter.log("driver closed");
	Log.info("driver closed");
	System.out.println("driver closed");
}
public void login()
{    
	
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pwd);
	driver.findElement(By.name(btn_login)).click();
	Log.info("application logged in");
	System.out.println("login");
	
}
public void addemp()
{
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("k");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("s");
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("emp added");
	driver.switchTo().defaultContent();
}
public void delemp()
{
	driver.switchTo().frame("rightMenu");
	Select st=new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. Last Name");
	driver.findElement(By.name("loc_name")).sendKeys("k");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.name("chkLocID[]")).click();
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
	System.out.println("delemp");
	driver.switchTo().defaultContent();
}
public void logout()
{
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("logout");
Log.info("logout");
}
}

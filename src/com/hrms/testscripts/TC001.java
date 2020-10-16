package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
@Test
public class TC001 {
	 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
public void tc01()
{
	DOMConfigurator.configure("log4j.xml");
   General obj=new General();
  
   obj.openApplication();
  
   obj.login();
   obj.logout();
   obj.closeApplication();
	}

}

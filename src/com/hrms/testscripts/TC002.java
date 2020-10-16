package com.hrms.testscripts;
import com.hrms.lib.*;
public class TC002 {
public static void main(String args[])
{
	General obj=new General();
	obj.openApplication();
	obj.login();
	obj.addemp();
	obj.logout();
	obj.closeApplication();
}
}

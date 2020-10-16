package com.hrms.testscripts;
import com.hrms.lib.*;
public class TC003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
General obj=new General();
obj.openApplication();
obj.login();
obj.delemp();
obj.logout();
obj.closeApplication();
	}

}

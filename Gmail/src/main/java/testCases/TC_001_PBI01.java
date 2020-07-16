package testCases;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecifiedMethods;

public class TC_001_PBI01 extends ProjectSpecifiedMethods{
	
	@Test
	public void loginToApplication() {
		
		new LoginPage().enterUserName().clickNext().enterPassWord().clickSubmit();
		
	}

}

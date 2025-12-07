package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{

	@Test
	public void verifyUserIsAbletoSuccessfullyLoggedOut() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUserNameOnUserNameField(usernamevalue);
		lp.enterPasswordOnPasswordField(passwordvalue);
		lp.clickOnLoginButton();
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnAdminButton();
		hp.clickOnLogoutButton();
	}
	
}

package testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pomRepo.LoginPage;
import pomRepo.WelcomePage;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "Login")
	public void testCase1(String userName,String password) {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickLogin();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail(userName);
		loginPage.enterPassword(password);
	}
	@DataProvider(name = "Login")
	public Object[][] testData() throws Throwable{
		ExcelLibrary lib = new ExcelLibrary();
		return lib.readMultipleData("Login");
	}
}

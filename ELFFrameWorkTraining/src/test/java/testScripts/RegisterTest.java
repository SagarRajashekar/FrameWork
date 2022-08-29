package testScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pomRepo.RegisterPage;
import pomRepo.WelcomePage;

public class RegisterTest extends BaseTest{
	
	@Test(dataProvider ="Register" )
	public void registerTestCase(String gender,String firstName,String lastName,String email,String password) {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickRegister();
		
		RegisterPage registerPage = new RegisterPage(driver);
		if(gender.contains("Male")) {
			registerPage.selectMaleRadioButton();
		}else if(gender.contains("Female")){
			registerPage.selectFemaleRadioButton();
		}
		registerPage.sendFirstName(firstName);
		registerPage.sendLastName(lastName);
	
		registerPage.sendEmail(email);
		registerPage.sendPassword(password);
		registerPage.sendConfirmPassword(password);
		registerPage.clickRegisterButton();
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws Throwable{
		ExcelLibrary lib = new ExcelLibrary();
		return lib.readMultipleData("Register");
	}
	
}

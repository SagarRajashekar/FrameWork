package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement emailTF;
	
	public void enterEmail(String email) {
		enterValue(emailTF, email);
	}
	
	@FindBy(id = "Password")
	WebElement passwordTF;
	
	public void enterPassword(String pwd) {
		enterValue(passwordTF, pwd);
	}
}
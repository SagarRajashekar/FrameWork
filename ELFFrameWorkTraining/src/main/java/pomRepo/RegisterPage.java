package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	WebElement maleRadioButton;
	
	public void selectMaleRadioButton() {
		clickAction(maleRadioButton);
	}
	
	@FindBy(id = "gender-female")
	WebElement femaleRadioButton;
	
	public void selectFemaleRadioButton() {
		clickAction(femaleRadioButton);
	}
	
	@FindBy(name = "FirstName")
	WebElement firstNameTF;
	
	public void sendFirstName(String firstName) {
		enterValue(firstNameTF, firstName);
	}
	
	@FindBy(name = "LastName")
	WebElement lastNameTF;
	
	public void sendLastName(String lastName) {
		enterValue(lastNameTF, lastName);
	}
	
	@FindBy(name = "Email")
	WebElement emailTF;
	
	public void sendEmail(String email) {
		enterValue(emailTF, email);
	}
	
	@FindBy(name = "Password")
	WebElement passwordTF;
	
	public void sendPassword(String pwd) {
		enterValue(passwordTF, pwd);
	}
	
	@FindBy(name = "ConfirmPassword")
	WebElement confirmPasswordTF;
	
	public void sendConfirmPassword(String cpwd) {
		enterValue(confirmPasswordTF, cpwd);
	}
	
	@FindBy(name = "register-button")
	WebElement registerButton;
	
	public void clickRegisterButton() {
		clickAction(registerButton);
	}
	
}

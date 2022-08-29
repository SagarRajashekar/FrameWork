package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	public void clickLogin() {
		clickAction(loginLink);
	}
	
	@FindBy(linkText = "Register")
	WebElement registerLink;
	
	public void clickRegister() {
		clickAction(registerLink);
	}

}

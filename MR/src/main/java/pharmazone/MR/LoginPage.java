package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="email")
	WebElement emailtxt;
	
	@FindBy(name="password")
	WebElement psswdtxt;
	
	
	@FindBy(css  = "html > body > div > div > div > form > div > div > div > div > div:nth-of-type(3) > button")
	WebElement loginbtn;
	
	@FindBy(css  = "html > body > div > div > div > form > div > div > div > div > div:nth-of-type(3) > a")
	WebElement forgtpssbtn;
	
	public void loginAsAdmin(String email, String password) {
		setTextElementText(emailtxt, email);
		setTextElementText(psswdtxt, password);
		clickButton(loginbtn);
		
	}
	public void forgetpassword() {
		clickButton(forgtpssbtn);
	}

}

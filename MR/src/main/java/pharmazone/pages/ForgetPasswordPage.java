package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends PageBase{

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name = "email")
	WebElement emailtxt;
	
	@FindBy(css = "html > body > div > div > div > form > div > div > div > div > div:nth-of-type(2) > button")
	WebElement sendpssbtn;
	
	@FindBy(css = "html > body > div > div > div > form > div > div > div > div > div:nth-of-type(2) > a")
	WebElement loginforumbtn;
	
	@FindBy(xpath = "//div[contains(text(),'an recovery email has been sent to you')]")
	public WebElement alertmsg;
	
	public void resetPassword(String email) {
		setTextElementText(emailtxt, email);
		clickButton(sendpssbtn);
	}
	
	public  LoginPage returnloginPage() {
		clickButton(loginforumbtn);
		return new LoginPage(driver);
	}
	
}

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
	
	
	@FindBy(partialLinkText ="login")
	WebElement loginbtn;

}

package shared;
import org.testng.annotations.Test;

import pharmazone.pages.ForgetPasswordPage;
import pharmazone.pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetPasswordAdminTest extends TestBase {

	LoginPage loginpageObject;
	ForgetPasswordPage forgetpasswordObject;
	String email = "admin@pharma.com";
	WebDriverWait wait;

	@Test(priority = 1, alwaysRun = true )
	public  void forgetPassword() {
		loginpageObject = new LoginPage(driver);
		loginpageObject.forgetpassword();
		wait = new WebDriverWait(driver, 5);
		String actualurl = "https://pharmazone.roqay.solutions/lost-password";
		String expectedurl = driver.getCurrentUrl();
		softassert.assertEquals(actualurl, expectedurl);
		wait.until(ExpectedConditions.urlToBe(actualurl));
		//add email for reset password page 
		forgetpasswordObject = new ForgetPasswordPage(driver);
		forgetpasswordObject.resetPassword(email);
		wait.until(ExpectedConditions.visibilityOf(forgetpasswordObject.alertmsg));
		
		forgetpasswordObject.returnloginPage();
	//	return LoginAdminTest();

	}
	@Test(priority =2, dependsOnMethods = "forgetPassword")
	public void loginAdminSuccessp()
	 {
		String email1= "ahmad@pharmazone-kw.com";
		String password="123456";
		loginpageObject = new LoginPage(driver);
		loginpageObject.loginAsAdmin(email1, password);
		String expectedpagetitle = driver.getTitle();
		String actualtitle ="Pharma Zone - dashboard";
		softassert.assertEquals(actualtitle,expectedpagetitle);
	}

}

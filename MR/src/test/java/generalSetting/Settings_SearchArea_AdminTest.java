package generalSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.ForgetPasswordPage;
import pharmazone.MR.LoginPage;
import shared.TestBase;

public class Settings_SearchArea_AdminTest extends TestBase  {
	
	LoginPage loginpageObject;
	ForgetPasswordPage forgetpasswordObject;
	String email = "admin@pharma.com";
	WebDriverWait wait;
	AreasPage AreaspageObject;
	String area="Mubarak Al-Kabeer Governorate";
	String editarea="Nuzha Gov";



	@Test(priority = 1, alwaysRun = true )
	public  void forgetPassword() {
		loginpageObject = new LoginPage(driver);
		loginpageObject.forgetpassword();
		wait = new WebDriverWait(driver, 5);
		String actualurl = "https://pharmazone.roqay.solutions/lost-password";
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
	}

	@Test(priority =3, dependsOnMethods = "loginAdminSuccessp")
	public void UserCanUseSearchFun()
	
	{
		driver.navigate().to("https://pharmazone.roqay.solutions/#/areas");
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.SearchArea(area);
		System.out.println(AreaspageObject.searchresulttext.getText());
		String expareatitle="Mubarak Al-Kabeer Governorate";
		softassert.assertEquals(area, expareatitle);

		}
	

}

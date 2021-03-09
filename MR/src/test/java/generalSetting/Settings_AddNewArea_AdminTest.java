package generalSetting;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.ForgetPasswordPage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.TestBase;


public class Settings_AddNewArea_AdminTest extends TestBase {

	LoginPage loginpageObject;
	ForgetPasswordPage forgetpasswordObject;
	String email = "admin@pharma.com";
	WebDriverWait wait;
	AreasPage AreaspageObject;
	String area="Nuzha Governorate";
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
	@Test(priority = 3)
	public void UserCanAddNewArea()
	{
		driver.navigate().to("https://pharmazone.roqay.solutions/#/areas");
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.AddNewArea(area);
		Assert.assertTrue(AreaspageObject.areanametxt.getText().contains(area));

	}
	
	@Test(priority = 4 , enabled = false)
	public void UserCanEditArea() throws InterruptedException
	{
		AreaspageObject.EditArea(editarea);
		System.out.println(AreaspageObject.savemsg.getText());
		Assert.assertTrue(AreaspageObject.savemsg.getText().contains("Successfully"));
	}

	@Test(priority = 5 )
	public void UserCanDeleteArea() throws InterruptedException
	{
		AreaspageObject.DeleteArea();
		Assert.assertTrue(AreaspageObject.deletsuccessmsg.getText().contains("Deleted Successfully"));

	}

}


package pharmazone.MR;

import org.testng.annotations.Test;

public class LoginAdminTest extends TestBase{

	LoginPage loginpageObject;
	String email = "ahmad@pharmazone-kw.com";
	String password = "123456";

	@Test
	public void loginAdminSuccess() throws InterruptedException {
		loginpageObject = new LoginPage(driver);
		loginpageObject.loginAsAdmin(email, password);
		String expectedpagetitle = driver.getTitle();
		String actualtitle ="Pharma Zone - dashboard";
		softassert.assertEquals(actualtitle,expectedpagetitle);

	}

}

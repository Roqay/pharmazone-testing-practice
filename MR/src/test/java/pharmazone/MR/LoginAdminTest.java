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
<<<<<<< HEAD

=======
	
>>>>>>> 75d3a78f6bc0357d5bd8914bffb58e8d25f2dc03
	}

}

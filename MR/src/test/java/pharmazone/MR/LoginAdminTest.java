package pharmazone.MR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class LoginAdminTest extends TestBase{
	LoginPage loginpageObject;
	
	
	@Test
	public void loginAdminSuccess() throws IOException {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String email = prop.getProperty("admin");
		String password = prop.getProperty("password");
		loginpageObject = new LoginPage(driver);
		loginpageObject.loginAsAdmin(email, password);
		String expectedpagetitle = driver.getTitle();
		String actualtitle = "Pharma Zone - dashboard";
		softassert.assertEquals(actualtitle, expectedpagetitle);

	}

	
	
	
	
	

}

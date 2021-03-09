package doctorSetting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pharmazone.MR.EditSpecialistyPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.SpecialtiesPage;
import pharmazone.MR.TestBase;

public class EditSpecialitiesTest extends TestBase{
	LoginPage loginpageObject;
	HomePage homepageObject;
	SpecialtiesPage specialatiesoageObject;
	EditSpecialistyPage editspecialObject;
	String editName = faker.name().title();
	
	
	@Test(priority = 1, alwaysRun = true)
	public void loginAdminSuccess() throws IOException {
		Properties prop = new Properties();
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
		driver.navigate().refresh();
		String expectedpagetitle = driver.getTitle();
		String actualtitle = "Pharma Zone - dashboard";
		softassert.assertEquals(actualtitle, expectedpagetitle);

	}

	@Test(priority = 2, dependsOnMethods = "loginAdminSuccess")
	public void openSpeicalitiesPager() throws InterruptedException {
		homepageObject = new HomePage(driver);
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openSpeicalPage();
		specialatiesoageObject = new SpecialtiesPage(driver);
		specialatiesoageObject.EditSpecialisty();
		String actualtitle = specialatiesoageObject.pagetitle.getText();
		String expectedtitle = "edit specialty";
		softassert.assertEquals(actualtitle, expectedtitle);

	}
	
	@Test(priority = 3, dependsOnMethods = {"loginAdminSuccess","openSpeicalitiesPager"})
	public void editSpecialName() {
		editspecialObject = new EditSpecialistyPage(driver);
		editspecialObject.editSpecialPage(editName);
		softassert.assertEquals(editName, editspecialObject.editNameTxt);
		
	}

	

}

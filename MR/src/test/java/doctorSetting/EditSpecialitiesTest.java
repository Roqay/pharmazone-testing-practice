package doctorSetting;

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
	
	

	@Test(priority = 1)
	public void openSpeicalitiesPage() throws InterruptedException {
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
	
	@Test(priority = 3, dependsOnMethods = {"openSpeicalitiesPage"})
	public void editSpecialName() {
		editspecialObject = new EditSpecialistyPage(driver);
		editspecialObject.editSpecialPage(editName);
		softassert.assertEquals("Data Saved Successfully", editspecialObject.successMsg);
		
	}

	

}

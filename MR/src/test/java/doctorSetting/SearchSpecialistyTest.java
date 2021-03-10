package doctorSetting;

import org.testng.annotations.Test;

import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.SpecialtiesPage;
import pharmazone.MR.TestBase;

public class SearchSpecialistyTest extends TestBase {
	
	LoginPage loginpageObject;
	HomePage homepageObject;
	SpecialtiesPage specialatiesoageObject;
	String searchTxt = "Nutrition";
	

	@Test(priority = 1)
	public void openSpeicalitiesPager() throws InterruptedException {
		homepageObject = new HomePage(driver);
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openSpeicalPage();
		specialatiesoageObject = new SpecialtiesPage(driver);
		specialatiesoageObject.SearchSpecialisty(searchTxt);
		softassert.assertNotEquals(searchTxt, specialatiesoageObject.searchresult);

	}

	

}

package doctorSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.SpecialtiesPage;
import shared.TestBase;

public class SearchSpecialistyTest extends TestBase {
	
	LoginPage loginpageObject;
	HomePage homepageObject;
	SpecialtiesPage specialatiesoageObject;
	String searchTxt = "Nutrition";
	

	@Test(priority = 1)
	public void openSpeicalitiesPager() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openSpeicalPage();
		specialatiesoageObject = new SpecialtiesPage(driver);
		specialatiesoageObject.SearchSpecialisty(searchTxt);
		softassert.assertEquals(searchTxt, specialatiesoageObject.searchresult);

	}

	

}

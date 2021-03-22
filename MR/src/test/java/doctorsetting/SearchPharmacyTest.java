package doctorsetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.PharmaciesPage;
import shared.TestBase;

public class SearchPharmacyTest extends TestBase{
	LoginPage loginpageObject;
	HomePage homepageObject;
	PharmaciesPage pharmacypageObject;
	String pharmacyname="Al Eqila Cop";
	
	@Test(priority = 1)
	public void searchPharmacyName() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openPharmacyPage();
		pharmacypageObject = new PharmaciesPage(driver);
		pharmacypageObject.searchPharmacy(pharmacyname);
		softassert.assertEquals(pharmacypageObject.searchresult, pharmacyname);
		
	}

}

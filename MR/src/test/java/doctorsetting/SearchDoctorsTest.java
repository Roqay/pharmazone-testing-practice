package doctorsetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.DoctorsPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class SearchDoctorsTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	DoctorsPage doctorpageObject;
	String doctorName ="Abas Baly Elshemary";
	String special="Dermatologist";
	String hospital="Fahaheel P.C";
	
	@Test (priority = 1)
	public void searchDoctors() throws InterruptedException {
		Thread.sleep(2000);
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openDoctorsPage();
		doctorpageObject = new DoctorsPage(driver);
		doctorpageObject.SearchDoctors(doctorName, special, hospital);
		softassert.assertEquals(doctorName,doctorpageObject.searchresult);
	}

}

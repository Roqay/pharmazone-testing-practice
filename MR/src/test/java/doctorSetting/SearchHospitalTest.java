package doctorSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.HomePage;
import pharmazone.MR.HospitalsPage;
import pharmazone.MR.LoginPage;
import shared.TestBase;

public class SearchHospitalTest extends TestBase{
	LoginPage loginpageObject;
	HomePage homepageObject;
	HospitalsPage hospitalpageObject;
	String hospitalName= "09 Clinic";
	
	@Test (priority = 1)
	public void searchByAllHospital() throws InterruptedException {
		Thread.sleep(2000);
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openHospitalPage();
		hospitalpageObject = new HospitalsPage(driver);
		hospitalpageObject.searchHospiatlPage(hospitalName);
		softassert.assertEquals(hospitalName, hospitalpageObject.searchresult);
		
	}

}

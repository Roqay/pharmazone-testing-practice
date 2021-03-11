package doctorSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.EditHospitalPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.HospitalsPage;
import pharmazone.MR.LoginPage;
import shared.TestBase;

public class EditHospiatlTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	HospitalsPage hospitalpageObject;
	EditHospitalPage editpageObject;
	String hospiatlName = faker.funnyName().name();
	String hospitalAdd = faker.address().fullAddress();
	String hospitalDesc= faker.rickAndMorty().character();
	
	@Test(priority = 1)
	public void EdithospitalDetails() {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		homepageObject.openHospitalPage();
		hospitalpageObject = new HospitalsPage(driver);
		hospitalpageObject.editHospiatlPage();
		editpageObject = new EditHospitalPage(driver);
		editpageObject.edithosiptal(hospitalAdd, hospitalAdd, hospitalDesc);
		wait.until(ExpectedConditions.urlContains("https://pharmazone.roqay.solutions/#/hospitals"));
		
	}
	@Test(priority = 2)
	public void ValidateNewHospiatladded() {
		hospitalpageObject.searchHospiatlPage(hospiatlName);
		softassert.assertEquals(hospiatlName, hospitalpageObject.searchresult);
		
	}

}

package doctorsetting;

import shared.TestBase;

import org.testng.annotations.Test;

import pharmazone.pages.AddSpecialityPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.SpecialtiesPage;

public class AddSpecialtiesTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	SpecialtiesPage specialatiesoageObject;
	AddSpecialityPage addspeicalpagePbject;
	// generate random name
	String specialName = faker.name().title();


	@Test(priority = 1)
	public void openSpeicalitiesPager() throws InterruptedException {
		homepageObject = new HomePage(driver);
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openSpeicalPage();
		specialatiesoageObject = new SpecialtiesPage(driver);
		specialatiesoageObject.AddNewSpeicalPage();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://pharmazone.roqay.solutions/#/doctors_specialties/create";
		softassert.assertEquals(actualurl, expectedurl);

	}

	@Test(priority = 2, dependsOnMethods = "openSpeicalitiesPager" )
	public void addNewSpeical() {
		addspeicalpagePbject = new AddSpecialityPage(driver);
		addspeicalpagePbject.AddNewSpeicality(specialName);
		softassert.assertEquals(specialName, addspeicalpagePbject.firstaddedSpecial);

	}

}

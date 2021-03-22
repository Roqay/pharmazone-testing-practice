package doctorsetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.AddHospitalPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.HospitalsPage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class AddHospitalTest extends TestBase{
	
	LoginPage loginpageObject;
	HomePage homepageObject;
	HospitalsPage hospitalpageObject;
	AddHospitalPage addhospitalpageObject;
	String hospiatlName = faker.funnyName().name();
	String hospitalAdd = faker.address().fullAddress();
	String hospitalDesc= faker.rickAndMorty().character();
	
	@Test(priority = 1)
	public void AddNewPrivateHospital() {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		homepageObject.openHospitalPage();
		hospitalpageObject = new HospitalsPage(driver);
		hospitalpageObject.addHospiatlPage();
		String atcualurl= driver.getCurrentUrl();
		String expectedurl = "https://pharmazone.roqay.solutions/#/hospitals/create";
		softassert.assertEquals( atcualurl, expectedurl );
		addhospitalpageObject = new AddHospitalPage(driver);
		addhospitalpageObject.addNewHospital(hospiatlName, hospitalAdd, hospitalDesc);
		wait.until(ExpectedConditions.urlContains("https://pharmazone.roqay.solutions/#/hospitals"));
	}
	
	//validate that application add the hospital correctly
	@Test(priority = 2)
	public void ValidateNewHospiatladded() {
		hospitalpageObject.searchHospiatlPage(hospiatlName);
		softassert.assertEquals(hospiatlName, hospitalpageObject.searchresult);
		
	}
	

}

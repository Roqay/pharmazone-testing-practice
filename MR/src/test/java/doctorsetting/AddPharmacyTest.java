package doctorsetting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.AddPharmacyPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.PharmaciesPage;
import shared.TestBase;

public class AddPharmacyTest extends TestBase{
	
	LoginPage loginpageObject;
	HomePage homepageObject;
	PharmaciesPage pharmacypageObject;
	AddPharmacyPage addpharmacyobject;
	String pharmacyname = faker.name().title();
	String pharmacyaddress= faker.address().fullAddress();
	
	@Test(priority = 1)
	public void AddNewPharmacy() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openPharmacyPage();
		pharmacypageObject = new PharmaciesPage(driver);
		pharmacypageObject.addNewPharmacyPage();
		String expectedurl = "https://pharmazone.roqay.solutions/#/pharmacies/create";
		String actualurl = driver.getCurrentUrl();
		softassert.assertEquals(actualurl, expectedurl);
		addpharmacyobject = new AddPharmacyPage(driver);
		addpharmacyobject.addNewPharmacy(pharmacyname,pharmacyaddress);
		wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.xpath("//a[contains(text(),'pharmacies')]"))));
		
		
	}
	
	@Test(priority = 2, dependsOnMethods = "AddNewPharmacy")
	public void ValidateNewPharmacyAdded() {
		pharmacypageObject.searchPharmacy(pharmacyname);
		softassert.assertEquals(pharmacypageObject.searchresult, pharmacyname);
		
	}

}

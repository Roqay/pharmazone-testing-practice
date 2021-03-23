package doctorsetting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.AddPharmacyPage;
import pharmazone.pages.EditPharmacyPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.PharmaciesPage;
import shared.TestBase;

public class EditPharmacyTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	PharmaciesPage pharmacypageObject;
	AddPharmacyPage addpharmacyobject;
	EditPharmacyPage editpharmacyobject;
	String pharmacyname = faker.name().title();
	String pharmacyaddress= faker.address().fullAddress();
	
	@Test(priority = 1)
	public void EditPharmacy() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openPharmacyPage();
		pharmacypageObject = new PharmaciesPage(driver);
		pharmacypageObject.editPharmacyPage();
		String expectedurl = "https://pharmazone.roqay.solutions/#/pharmacies/edit/374";
		String actualurl = driver.getCurrentUrl();
		softassert.assertEquals(actualurl, expectedurl);
		editpharmacyobject = new EditPharmacyPage(driver);
		editpharmacyobject.editNewPharmacy(pharmacyname, pharmacyaddress);
		wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.xpath("//a[contains(text(),'pharmacies')]"))));
	}
	
	@Test(priority = 2, dependsOnMethods = "EditPharmacy")
	public void ValidateEditPharmacy() {
		pharmacypageObject.searchPharmacy(pharmacyname);
		softassert.assertEquals(pharmacypageObject.searchresult, pharmacyname);
		
	}

}

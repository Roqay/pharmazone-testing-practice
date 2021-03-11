package doctorSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pharmazone.MR.EditSpecialistyPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.SpecialtiesPage;
import shared.TestBase;

public class EditSpecialitiesTest extends TestBase{
	LoginPage loginpageObject;
	HomePage homepageObject;
	SpecialtiesPage specialatiesoageObject;
	EditSpecialistyPage editspecialObject;
	String editName = faker.name().title();
	
	

	@Test(priority = 1)
	public void openSpeicalitiesPage() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openSpeicalPage();
		specialatiesoageObject = new SpecialtiesPage(driver);
		specialatiesoageObject.EditSpecialisty();
		String actualtitle = specialatiesoageObject.pagetitle.getText();
		String expectedtitle = "edit specialty";
		softassert.assertEquals(actualtitle, expectedtitle);

	}
	
	@Test(priority = 2, dependsOnMethods = {"openSpeicalitiesPage"})
	public void editSpecialName() {
		editspecialObject = new EditSpecialistyPage(driver);
		editspecialObject.editSpecialPage(editName);
		softassert.assertEquals("Data Saved Successfully", editspecialObject.successMsg);
		
	}

	

}

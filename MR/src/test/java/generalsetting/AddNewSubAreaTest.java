package generalsetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.AreasPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.SubAreaPage;
import shared.TestBase;

public class AddNewSubAreaTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	AreasPage AreaspageObject;
	SubAreaPage SubAreaPageObject;
	WebDriverWait wait;
	String Areaname="Hawalli Governorate";
	String subareaname=faker.address().city();


	@Test(priority = 1)
	public void UserCanAddSubArea() throws InterruptedException {
		homepageObject=new HomePage(driver);
		homepageObject.opensettingpage();
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.opensubareaform();
		SubAreaPageObject=new SubAreaPage(driver);
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SubAreaPageObject.arealist));
		SubAreaPageObject.addnewsubarea(Areaname,subareaname);
		softassert.assertTrue(SubAreaPageObject.successmessage.getText().contains("Successfully"));
	}
}

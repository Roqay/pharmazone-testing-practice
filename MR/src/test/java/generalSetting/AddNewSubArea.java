package generalSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import pharmazone.MR.SubAreaPage;
import shared.TestBase;

public class AddNewSubArea extends TestBase {
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

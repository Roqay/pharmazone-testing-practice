package generalSetting;

import org.junit.Assert;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import shared.TestBase;

public class DeleteArea extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	AreasPage AreaspageObject;
	String area="Nuzha Governorate";

	@Test(priority = 1)
	public void UserCanDeleteArea() throws InterruptedException {
		homepageObject=new HomePage(driver);
		homepageObject.opensettingpage();
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.AddNewArea(area);
		AreaspageObject.DeleteArea();
		Assert.assertTrue(AreaspageObject.deletsuccessmsg.getText().contains("Deleted Successfully"));

	}
}

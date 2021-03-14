package generalsetting;

import org.junit.Assert;
import org.testng.annotations.Test;

import pharmazone.pages.AreasPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class DeleteAreaTest extends TestBase {
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

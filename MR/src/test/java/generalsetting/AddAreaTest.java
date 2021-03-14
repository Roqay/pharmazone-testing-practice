package generalsetting;

import org.junit.Assert;
import org.testng.annotations.Test;

import pharmazone.pages.AreasPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class AddAreaTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	AreasPage AreaspageObject;
	String area="Nuzha Governorate";

	@Test(priority = 1)
	public void AddNewArea() {
		homepageObject=new HomePage(driver);
		homepageObject.opensettingpage();
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.AddNewArea(area);
		Assert.assertTrue(AreaspageObject.areanametxt.getText().contains(area));

	}
}

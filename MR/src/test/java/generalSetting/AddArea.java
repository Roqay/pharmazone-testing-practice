package generalSetting;

import org.junit.Assert;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
import shared.TestBase;

public class AddArea extends TestBase {
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

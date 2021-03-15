package generalsetting;

import org.testng.annotations.Test;
import pharmazone.pages.BrandsPage;
import pharmazone.pages.HomePage;
import shared.TestBase;

public class DeleteBrandTest extends TestBase {
	HomePage homepageObject;
	BrandsPage brandspageObject ;


	@Test(priority = 1)
	public void UserCanDeleteBrand() throws InterruptedException {
		homepageObject=new HomePage(driver); 
		homepageObject.openbrandspage();
		brandspageObject=new BrandsPage(driver); 
		brandspageObject.deletebrand();
		softassert.assertTrue(brandspageObject.deletesuccessmsg.getText().contains("Successfully"));


	}
}

package generalsetting;

import org.testng.annotations.Test;

import pharmazone.pages.AddBrandDetailsPage;
import pharmazone.pages.BrandsPage;
import pharmazone.pages.EditBrandPage;
import pharmazone.pages.HomePage;
import shared.TestBase;

public class EditBrandTest extends TestBase{

	HomePage homepageObject;
	BrandsPage brandspageObject ;
	AddBrandDetailsPage branddetailsObject;
	EditBrandPage EditBrandObject;
	String brandname=faker.cat().name();

	@Test(priority = 1)
	public void UserCanEditBrandName() {
		homepageObject=new HomePage(driver); 
		homepageObject.openbrandspage();
		brandspageObject=new BrandsPage(driver); 
		brandspageObject.editbrand();
		EditBrandObject=new EditBrandPage(driver);
		EditBrandObject.editbrand(brandname);
		softassert.assertTrue(EditBrandObject.editbrandsuccessmsg.getText().contains("Successfully"));  

	}
}

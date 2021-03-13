package generalSetting;

import org.testng.annotations.Test;

import pharmazone.MR.AddBrandDetailsPage;
import pharmazone.MR.BrandsPage;
import pharmazone.MR.EditBrandPage;
import pharmazone.MR.HomePage;
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

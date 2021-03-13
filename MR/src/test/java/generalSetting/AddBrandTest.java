package generalSetting;


import org.testng.annotations.Test;
import pharmazone.MR.AddBrandDetailsPage;
import pharmazone.MR.BrandsPage;
import pharmazone.MR.HomePage;
import shared.TestBase;

public class AddBrandTest extends TestBase {
	HomePage homepageObject;
	BrandsPage brandspageObject ;
	AddBrandDetailsPage branddetailsobject;
	String brandname=faker.cat().name();
	
  @Test(priority = 1)
  public void UserCanAddNewBrand() {
	  homepageObject=new HomePage(driver); 
	  homepageObject.openbrandspage();
	  brandspageObject=new BrandsPage(driver); 
	  brandspageObject.addnewbrand();
	  branddetailsobject=new AddBrandDetailsPage(driver); 
	  branddetailsobject.addbrand(brandname);
	  softassert.assertTrue(branddetailsobject.addbrandsuccessmessage.getText().contains("Successfully"));

  }
}

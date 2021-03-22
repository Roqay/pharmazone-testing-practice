package generalsetting;

import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.ProductsPage;
import shared.TestBase;

public class ProductSearchTest extends TestBase {
	HomePage homepageObject;
	ProductsPage ProductsObjects;
	String productname="Oscar";
	
  @Test(priority = 1)
  public void UserCanSearchForProduct() {
	  homepageObject=new HomePage(driver);
	  homepageObject.openproductpage();
	  ProductsObjects =new ProductsPage(driver);
	  ProductsObjects.searchforproducts(productname);
	  softassert.assertTrue(ProductsObjects.returnproductname.getText().contains("Chloe"));
	  
  }
}

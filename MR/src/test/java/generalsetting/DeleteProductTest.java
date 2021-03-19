package generalsetting;

import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.ProductsDetailsPage;
import pharmazone.pages.ProductsPage;
import shared.TestBase;

public class DeleteProductTest extends TestBase  {

	HomePage homepageObject;
	ProductsPage ProductsObjects;
	ProductsDetailsPage ProductsDetailsObjects;
	String brandname="Merz";
	String productname=faker.cat().name();
	String skunumber=faker.number().digits(11);
	String price=faker.number().digits(4);
	String priceafter=faker.number().digits(3);
	String cost=faker.number().digits(2);
	String Commission=faker.number().digits(1);
	String imageName = "pharma.jpg";
	String imagePath = System.getProperty("user.dir")+"/resources/"+"/uploads/"+imageName;	
	@Test(priority = 1)
	public void UserCanDeleteProduct() throws InterruptedException {
		homepageObject=new HomePage(driver);
		homepageObject.openproductpage();
		ProductsObjects=new ProductsPage(driver);
		ProductsObjects.openaddproductpage();
		ProductsDetailsObjects=new ProductsDetailsPage(driver);
		ProductsDetailsObjects.addnewproduct(brandname, productname, skunumber, price, priceafter, cost, Commission ,imagePath);
		ProductsObjects.deleteproduct();
		softassert.assertTrue(ProductsObjects.deletesuccessmsg.getText().contains("Successfully"));
	}
}

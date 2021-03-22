package generalsetting;

import org.junit.Assert;
import org.testng.annotations.Test;

import pharmazone.pages.AreasPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;


public class EditAreaTest extends TestBase {

	LoginPage loginpageObject;
	HomePage homepageObject;
	AreasPage AreaspageObject;
	String editarea="Nuzha Gov";


	@Test(priority = 1)
	public void UserCanEditArea()
	{
		homepageObject=new HomePage(driver);
		homepageObject.opensettingpage();
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.EditArea(editarea);
		System.out.println(AreaspageObject.savemsg.getText());
		Assert.assertTrue(AreaspageObject.savemsg.getText().contains("Successfully"));
		
	}



}


package generalsetting;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.AreasPage;
import pharmazone.pages.ForgetPasswordPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class SearchAreaTest extends TestBase  {
	
	LoginPage loginpageObject;
	HomePage homepageObject;
	AreasPage AreaspageObject;
	ForgetPasswordPage forgetpasswordObject;
	String email = "admin@pharma.com";
	WebDriverWait wait;
	String area="Mubarak Al-Kabeer Governorate";
	String editarea="Nuzha Gov";


	@Test(priority = 1)
	public void UserCanUseSearchFun()
	
	{
		homepageObject=new HomePage(driver);
		homepageObject.opensettingpage();
		AreaspageObject=new AreasPage(driver);
		AreaspageObject.SearchArea(area);
		System.out.println(AreaspageObject.searchresulttext.getText());
		String expareatitle="Mubarak Al-Kabeer Governorate";
		softassert.assertEquals(area, expareatitle);

		}
	

}

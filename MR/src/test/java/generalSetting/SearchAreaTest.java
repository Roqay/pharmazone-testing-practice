package generalSetting;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.MR.AreasPage;
import pharmazone.MR.ForgetPasswordPage;
import pharmazone.MR.HomePage;
import pharmazone.MR.LoginPage;
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

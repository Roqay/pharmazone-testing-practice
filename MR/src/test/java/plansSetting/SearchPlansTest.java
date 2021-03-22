package plansSetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.PlansPage;
import shared.TestBase;

public class SearchPlansTest extends TestBase{
	
	HomePage homepageObject;
	PlansPage planpageObject;
	String name = "Sabreen Sultan";
	String calendar = "2021-02";
	String startdate= "02/01/2021";
	String enddate= "02/28/2021";
	
	@Test
	public void searchPlans() {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.planslist));
		homepageObject.openPlanSetting();
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.plansbtn));
		homepageObject.openPlansPage();
		planpageObject = new PlansPage(driver);
		planpageObject.searchPlan(name, calendar, startdate, enddate);
	}

}

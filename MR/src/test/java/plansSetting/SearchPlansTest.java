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
	
	@Test(priority = 1)
	public void searchPlans() throws InterruptedException {
		Thread.sleep(2000);
		homepageObject = new HomePage(driver);
		Thread.sleep(2000);
		WebDriverWait  wait = new WebDriverWait(driver, 20);
		homepageObject.openPlanSetting();
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.planslist));
		homepageObject.openPlansPage();
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.plansbtn));
		planpageObject = new PlansPage(driver);
		planpageObject.searchPlan(name, calendar, startdate, enddate);
	}

}

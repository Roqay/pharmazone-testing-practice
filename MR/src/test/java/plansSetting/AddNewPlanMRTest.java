package plansSetting;

import pharmazone.pages.HomePage;
import pharmazone.pages.PlansPage;
import shared.TestBase;

public class AddNewPlanMRTest extends TestBase{
	HomePage homepageObject;
	PlansPage planpageObject;
	
	public void addNewPlan() throws InterruptedException {
		homepageObject = new HomePage(driver);
		homepageObject.openPlanSetting();
		Thread.sleep(2000);
		homepageObject.openPlansPage();
		planpageObject= new PlansPage(driver);
		planpageObject.addNewPlan();
	}
	

}

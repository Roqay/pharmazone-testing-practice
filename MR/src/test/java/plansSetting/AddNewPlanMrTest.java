package plansSetting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.PlansPage;
import shared.TestBase;

public class AddNewPlanMrTest extends TestBase{
	HomePage homepageObject;
	PlansPage planpageObject;
	
	
	@Test(priority = 1)
	public void addNewPlanasMr() throws InterruptedException {
		Thread.sleep(2000);
		homepageObject = new HomePage(driver);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,500)","");
		homepageObject.openPlanSetting();
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.planslist));
		homepageObject.openPlansPage();
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.plansbtn));
		planpageObject = new PlansPage(driver);
		planpageObject.addNewPlan();
		String expectedurl = "https://pharmazone.roqay.solutions/#/plans/create";
		String actualurl = driver.getCurrentUrl();
		softassert.assertEquals(expectedurl, actualurl);
	}
	

}

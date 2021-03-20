package generalsetting;

import org.testng.annotations.Test;

import pharmazone.pages.CalendarDetailsPage;
import pharmazone.pages.CalendarPage;
import pharmazone.pages.HomePage;
import shared.TestBase;

public class CalendarTest extends TestBase {
	HomePage homepageObject;
	CalendarPage CalendarObject;
	CalendarDetailsPage CalendarDetailsObject;
	String kpi ="KPI for June 2020";


	@Test(priority = 1)
	public void UserCanAddNewCalendar() throws InterruptedException {
		homepageObject=new HomePage(driver);
		homepageObject.opencalendarspage();
		CalendarObject=new CalendarPage(driver);
		CalendarObject.openCalendarpage();
		CalendarDetailsObject=new CalendarDetailsPage (driver);
		CalendarDetailsObject.addnewCalendar(kpi);
		softassert.assertTrue(CalendarObject.successmsg.getText().contains("success"));
	}
}

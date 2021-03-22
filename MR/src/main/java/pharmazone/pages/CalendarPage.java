package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends PageBase {

	public CalendarPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(partialLinkText ="Add N")
	WebElement addnewCalendar;
	@FindBy(xpath ="//h2[contains(text(),'Success')]")
	public WebElement successmsg;
	
	
	
	public void openCalendarpage()
	{
		clickButton(addnewCalendar);
	}
	

}

package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarDetailsPage extends PageBase {

	public CalendarDetailsPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="//input[@type='text']")
	WebElement selectmonth;
	@FindBy(xpath="//span[contains(text(),'March')]")
	WebElement selectmonthmarch;
	@FindBy(tagName ="select")
	WebElement selectkpi;
	@FindBy(xpath ="//button[contains(text(),'add')]")
	WebElement addbtn;
	

	
	public void addnewCalendar(String kpi) throws InterruptedException
	{
		Thread.sleep(3000);
		clickButton(selectmonth);
		clickButton(selectmonthmarch);
		selectDropdownmenu(selectkpi, kpi);
		clickButton(addbtn);
		
	}

}

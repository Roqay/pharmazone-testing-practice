package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlansPage extends PageBase {

	public PlansPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css= "[placeholder='name']")
	WebElement nameTxt;
	
	@FindBy(css= "select")
	WebElement selectCalendar;
	
	@FindBy(xpath= "//div[@class='row']/div[3]//input[@class='form-control']")
	WebElement datefromselect;
	
	@FindBy(xpath= "//div[4]//input[@class='form-control']")
	WebElement datetoselect;
	
	@FindBy(xpath= "//button[contains(text(),'search')]")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"app-table\"]/table[1]/tbody[1]/tr[1]/td[2]")
	public WebElement searchresult;
	
	@FindBy(xpath= "//a[@href='#/plans/create']/span[1]")
	WebElement addbtn;
	
	@FindBy(xpath= "//a[@href='#/plans/edit/602']/i[@class='icon-edit']")
	WebElement editbtn;
	
	@FindBy(xpath= "//a[@href='#/plans/edit/602']/i[@class='icon-edit']")
	WebElement deletebtn;
	
	
	
	public void addNewPlan() {
		clickButton(addbtn);
	}
	public void editPlan() {
		clickButton(editbtn);
	}
	public void deletePlan() {
		clickButton(deletebtn);
	}
	public void searchPlan(String planNam, String calendar, String datefrom, String dateto ) {
		setTextElementText(nameTxt, planNam);
		selectDropdownmenu(selectCalendar, calendar);
		setTextElementText(datefromselect, datefrom);
		setTextElementText(datetoselect, dateto);
		clickButton(searchbtn);
	}

	
}

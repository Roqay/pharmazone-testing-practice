package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPlanMr extends PageBase{

	public AddPlanMr(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//form[@id='add-area']/div[@class='row']/div[1]//select[@class='form-control']")
	WebElement selectteam;
	
	@FindBy(id="exampleInputNameEn")
	WebElement planname;
	
	@FindBy(id="exampleInputCalendar")
	WebElement calendarselect;
	
	@FindBy(xpath="//*[@id=\"add-area\"]/div[1]/div[2]/div[1]/span[1]/input[1]")
	WebElement startdate;
	
	@FindBy(xpath="//*[@id=\"add-area\"]/div[1]/div[3]/div[1]/span[1]/input[1]")
	WebElement enddate;
	
	@FindBy(id="rsq")
	WebElement salescount;
	
	@FindBy(xpath="//div[4]//select[@class='form-control']")
	WebElement selectemp;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement savebtn;

	
	public void addPlanforMR(String team, String planName, String calendar,String planstartdate, String planenddate, String salescounter, String empname) {
		 selectDropdownmenu(selectteam, team);
		 setTextElementText(planname, planName);
		 selectDropdownmenu(calendarselect, calendar);
		 setTextElementText(startdate, planstartdate);
		 setTextElementText(enddate, planenddate);
		 setTextElementText(salescount, salescounter);
		 selectDropdownmenu(selectemp, empname);
		 clickButton(savebtn);
	}
	
}
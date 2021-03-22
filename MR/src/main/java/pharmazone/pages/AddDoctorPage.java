package pharmazone.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddDoctorPage extends PageBase {

	public AddDoctorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="exampleInputname")
	WebElement doctornametxt;
	
	@FindBy(id="exampleInputspecialty")
	WebElement speicaldropdownlist;
	
	@FindBy(id="exampleInputType")
	WebElement hospitaldrodpwnlist;
	
	@FindBy(id="exampleInputarea")
	WebElement areadrodpwnlist;
	
	@FindBy(id="exampleInputcategory")
	WebElement doctorcategorylist;
	
	@FindBy(id="exampleInputphone_number")
	WebElement doctorphonetxt;
	
	@FindBy(id="exampleInputmobile_number")
	WebElement doctormobiletxt;
	
	@FindBy(id="exampleInputstart_work_hour")
	WebElement starthourtime;
	
	@FindBy(id="exampleInputend_work_hour")
	WebElement endhourtime;
	
	@FindBy(css=".select2-selection__rendered")
	List<WebElement> offdaysdrodownlist;
	
	@FindBy(xpath="//*[@id=\"add-ds\"]/button[1]")
	public WebElement savebtn;
	
	public void addNewDoctor(String name, String speciality, String hospital, String area, String category, String phone,String mobile
			,String starthour, String endhour,String offdays) {
		setTextElementText(doctornametxt, name);
		selectDropdownmenu(speicaldropdownlist, speciality);
		selectDropdownmenu(hospitaldrodpwnlist, hospital);
		selectDropdownmenu(areadrodpwnlist, area);
		selectDropdownmenu(doctorcategorylist, category);
		setTextElementText(doctorphonetxt, phone);
		setTextElementText(doctormobiletxt, mobile);
		setTextElementText(starthourtime, starthour);
		setTextElementText(endhourtime, endhour);
		offdaysdrodownlist.get(0).click();
		clickButton(savebtn);
		
	}

	
}

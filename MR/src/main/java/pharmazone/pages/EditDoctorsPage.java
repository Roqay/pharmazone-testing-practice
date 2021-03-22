package pharmazone.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditDoctorsPage extends PageBase{

	public EditDoctorsPage(WebDriver driver) {
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
	
	@FindBy(xpath=" //button[contains(text(),'save')]")
	public WebElement savebtn;
	
	public void editNewDoctor(String name, String speciality, String hospital, String area, String category, String phone,String mobile
			,String starthour, String endhour,String offdays) {
		clearinput(doctornametxt);
		setTextElementText(doctornametxt, name);
		clearinput(speicaldropdownlist);
		selectDropdownmenu(speicaldropdownlist, speciality);
		clearinput(hospitaldrodpwnlist);
		selectDropdownmenu(hospitaldrodpwnlist, hospital);
		clearinput(areadrodpwnlist);
		selectDropdownmenu(areadrodpwnlist, area);
		clearinput(doctorcategorylist);
		selectDropdownmenu(doctorcategorylist, category);
		clearinput(doctorphonetxt);
		setTextElementText(doctorphonetxt, phone);
		clearinput(doctormobiletxt);
		setTextElementText(doctormobiletxt, mobile);
		clearinput(starthourtime);
		setTextElementText(starthourtime, starthour);
		clearinput(endhourtime);
		setTextElementText(endhourtime, endhour);
		offdaysdrodownlist.get(0).click();
		clickButton(savebtn);
		
	}


}

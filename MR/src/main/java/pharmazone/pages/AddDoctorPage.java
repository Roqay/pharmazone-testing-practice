package pharmazone.pages;

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
	
	@FindBy(xpath="//*[@id=\"add-ds\"]/div[1]/div[10]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	WebElement offdaysdrodownlist;
	
	@FindBy(xpath="//*[@id=\"add-ds\"]/button[1]")
	WebElement savebtn;
	
	public void addNewDoctor(String name, String speciality, String hospital, String area, String category) {
		
	}
}

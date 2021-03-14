package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorsPage extends PageBase{

	public DoctorsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="exampleInputft")
	WebElement searchdoctornametxt;
	
	@FindBy(id="specialty_id")
	WebElement specialdrodownlist;

	@FindBy(id="hospital_id")
	WebElement hospitaldropwodnlist;
	
	@FindBy(xpath="//button[contains(text(),'search')]")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[contains(.,'Add New')]")
	WebElement addnewdoctorbtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement editdoctorbtn;
	
	@FindBy(xpath="//tr[@class='dlt-1214']//i[@class='icon-bin']")
	WebElement deletebtn;
	
	public void AddDoctorsPage() {
		clickButton(addnewdoctorbtn);
	}

	public void EditDoctorsPage() {
		clickButton(editdoctorbtn);
	}
	
	public void DeleteDoctors() {
		clickButton(deletebtn);
	}
	
	public void SearchDoctors(String doctorname, String special, String hospital) {
		setTextElementText(searchdoctornametxt,doctorname);
		selectDropdownmenu(specialdrodownlist, special);
		selectDropdownmenu(hospitaldropwodnlist, hospital);
		clickButton(searchbtn);
		
	}
	
	
}

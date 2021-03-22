package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddHospitalPage extends PageBase{

	public AddHospitalPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="exampleInputName")
	WebElement hospitalNameText;
	
	@FindBy(id="exampleInputaddress")
	WebElement hospitaladdressText;
	
	@FindBy(id="type")
	WebElement hospitaltypeSelect;
	
	@FindBy(id="desc")
	WebElement hospitaldescSelect;
	
	@FindBy(xpath="//button[contains(text(),'add')]")
	WebElement addbtn;
	
	public void addNewHospital(String hospitalName, String hospitalAdd, String hospitalDesc) {
		setTextElementText(hospitalNameText, hospitalName);
		setTextElementText(hospitaladdressText, hospitalAdd);
		selectDropdownmenu(hospitaltypeSelect, "Private");
		setTextElementText(hospitaldescSelect, hospitalDesc);
		clickButton(addbtn);
	}

}

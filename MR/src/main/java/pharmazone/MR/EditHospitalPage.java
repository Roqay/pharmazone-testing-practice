package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditHospitalPage extends PageBase{

	public EditHospitalPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@href='#/hospitals/edit/100']/i[@class='icon-edit']")
	WebElement edithositalbtn;
	
	@FindBy(id="exampleInputName")
	WebElement hospitalNameText;
	
	@FindBy(id="exampleInputaddress")
	WebElement hospitaladdressText;
	
	@FindBy(id="type")
	WebElement hospitaltypeSelect;
	
	@FindBy(id="desc")
	WebElement hospitaldescSelect;
	
	@FindBy(xpath="//button[contains(text(),'save')]")
	WebElement editbtn;

	public void edithosiptal(String hospitalName, String hospitalAdd, String hospitalDesc) {
		clearinput(hospitalNameText);
		setTextElementText(hospitalNameText, hospitalName);
		clearinput(hospitaladdressText);
		setTextElementText(hospitaladdressText, hospitalAdd);
		selectDropdownmenu(hospitaltypeSelect, "private");
		clearinput(hospitaldescSelect);
		setTextElementText(hospitaldescSelect, hospitalDesc);
		clickButton(editbtn);
	}
}

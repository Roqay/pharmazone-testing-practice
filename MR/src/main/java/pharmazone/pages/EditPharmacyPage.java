package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPharmacyPage extends PageBase{

	public EditPharmacyPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="exampleInputName")
	WebElement pharmacyname;
	
	@FindBy(id="exampleInputaddress")
	WebElement pharmacyaddress;
	
	@FindBy(xpath="//button[contains(text(),'save')]")
	WebElement addpharmacybtn;
	
	public void editNewPharmacy(String name, String address) {
		clearinput(pharmacyname);
		setTextElementText(pharmacyname, name);
		clearinput(pharmacyaddress);
		setTextElementText(pharmacyaddress, address);
		clickButton(addpharmacybtn);
	}
	
}

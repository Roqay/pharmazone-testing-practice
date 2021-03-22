package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPharmacyPage extends PageBase{

	public AddPharmacyPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="exampleInputName")
	WebElement pharmacyname;
	
	@FindBy(id="exampleInputaddress")
	WebElement pharmacyaddress;
	
	@FindBy(xpath="//button[contains(text(),'add')]")
	WebElement addpharmacybtn;
	
	public void addNewPharmacy(String name, String address) {
		setTextElementText(pharmacyname, name);
		setTextElementText(pharmacyaddress, address);
		clickButton(addpharmacybtn);
	}
	

}

package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSpecialistyPage extends PageBase {

	public EditSpecialistyPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="exampleInputNameEn")
	 WebElement speicalTxt;
	
	@FindBy(xpath="//button[contains(text(),'save')]")
	WebElement saveNameBtn;
	
	@FindBy(xpath="//div[contains(text(),'data saved successfully')]")
	public WebElement successMsg;

	public void editSpecialPage(String editName) {
		speicalTxt.clear();
		setTextElementText(speicalTxt, editName);
		clickButton(saveNameBtn);
	}
}

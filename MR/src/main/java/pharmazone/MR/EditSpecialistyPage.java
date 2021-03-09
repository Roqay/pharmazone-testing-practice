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
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	public WebElement editNameTxt;

	public void editSpecialPage(String editName) {
		speicalTxt.clear();
		setTextElementText(speicalTxt, editName);
		clickButton(saveNameBtn);
	}
}

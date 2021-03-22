package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSpecialityPage extends PageBase {

	public AddSpecialityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="exampleInputNameEn")
	WebElement specialnametxt;
	
	@FindBy(xpath="//button[contains(text(),'add')]")
	WebElement addspecialbtn;
	
	
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	public WebElement firstaddedSpecial;
	
	public void AddNewSpeicality(String sepcialName) {
		setTextElementText(specialnametxt, sepcialName);
		clickButton(addspecialbtn);
	}

}

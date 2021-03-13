package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBrandDetailsPage extends PageBase {

	public AddBrandDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='exampleInputNameEn']")
	WebElement brandnametextbox;
	@FindBy(xpath="//button[contains(text(),'add')]")
	WebElement addbtn;
	@FindBy(xpath="//div[contains(text(),'data saved successfully')]")
	public WebElement addbrandsuccessmessage;
	
	
	
	public void addbrand(String brandname)
	{
		setTextElementText(brandnametextbox, brandname);
		clickButton(addbtn);
	}

}

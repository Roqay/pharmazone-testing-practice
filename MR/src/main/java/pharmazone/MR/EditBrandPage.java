package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBrandPage extends PageBase {

	public EditBrandPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='exampleInputNameEn']")
	WebElement brandtextbox;
	@FindBy(xpath="//button[contains(text(),'save')]")
	WebElement savebtn;
	@FindBy(xpath="//div[contains(text(),'data saved successfully')]")
	public WebElement editbrandsuccessmsg;
	

	public void editbrand(String brandname)
	{
		setTextElementText(brandtextbox, brandname);
		clickButton(savebtn);
	}

}

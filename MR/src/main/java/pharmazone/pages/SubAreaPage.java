package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SubAreaPage extends PageBase {

	public SubAreaPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='exampleInputNameEn']")
	WebElement subareanamebox;
	@FindBy(xpath="//button[contains(text(),'add')]")
	WebElement savesubareabtn;
	@FindBy(xpath="//select[@id='exampleInputparent_area']")
	public WebElement arealist;
	@FindBy(xpath="//div[contains(text(),'data saved successfully')]")
	public WebElement successmessage;
	
	
	
	public void addnewsubarea( String Areaname , String subareaname )
	{
		
		selectDropdownmenu(arealist, Areaname);
		setTextElementText(subareanamebox, subareaname);
		clickButton(savesubareabtn);
	}
	



}

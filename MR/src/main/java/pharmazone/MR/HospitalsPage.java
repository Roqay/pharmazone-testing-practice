package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HospitalsPage extends PageBase{
	public Select dropdown;

	public HospitalsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="search_query")
	WebElement searchhospitalTxt;
	
	@FindBy(name="type")
	WebElement searchbyTypeselect;
	
	@FindBy(xpath="//button[contains(text(),'search')]")
	WebElement searchbtn;
	
	@FindBy(name="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement addhospitabtn;
	
	@FindBy(name="//a[@href='#/hospitals/edit/100']")
	WebElement edithospitalbtn;
	
	@FindBy(name="//tr[@class='dlt-100']//i[@class='icon-bin']")
	WebElement deletehospitalbtn;
	
	@FindBy(name="//tr[@class='dlt-100']//i[@class='icon-bin']")
	WebElement deletehospitalbtn;
	
	public void openHospiatlPage() {
		clickButton(addhospitabtn);
	}
	
	public void editHospiatlPage() {
		clickButton(edithospitalbtn);
	}
	
	public void deleteHospiatlPage() {
		clickButton(deletehospitalbtn);
	}
	
	public void searchHospiatlPage(String hospitalName) {
		setTextElementText(searchhospitalTxt, hospitalName);
		dropdown = new Select(searchbyTypeselect);  
		dropdown.selectByVisibleText("All");
		clickButton(addhospitabtn);
	}
	
	

}

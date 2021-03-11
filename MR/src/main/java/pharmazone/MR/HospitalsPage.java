package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HospitalsPage extends PageBase{
	
	public HospitalsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="search_query")
	WebElement searchhospitalTxt;
	
	@FindBy(id="type")
	WebElement searchbyTypeselect;
	
	@FindBy(xpath="//button[contains(text(),'search')]")
	WebElement searchbtn;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	public WebElement searchresult; 
	
	
	@FindBy(xpath="//a[contains(.,'Add New')]")
	WebElement addhospitabtn;
	
	@FindBy(name="//a[@href='#/hospitals/edit/100']")
	WebElement edithospitalbtn;
	
	@FindBy(name="//tr[@class='dlt-100']//i[@class='icon-bin']")
	WebElement deletehospitalbtn;
	
	
	public void addHospiatlPage() {
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
		clickButton(searchbyTypeselect);
		selectDropdownmenu(searchbyTypeselect, "All");
		//dropdown = new Select(searchbyTypeselect);  
		//dropdown.selectByVisibleText("All");
		clickButton(searchbtn);
	}
	
	

}

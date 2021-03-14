package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmaciesPage extends PageBase{

	public PharmaciesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(.,'Add New')]")
	WebElement addbtn;
	
	@FindBy(id="exampleInputft")
	WebElement searchtxt;
	
	@FindBy(xpath="//*[@id=\"search_form\"]/div[1]/div[2]/button[1]")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@href='#/pharmacies/edit/371']")
	WebElement editbtn;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]")
	WebElement deletebtn;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	public WebElement searchresult;
	
	public void addNewPharmacyPage() {
		clickButton(addbtn);
	}
	
	public void editPharmacyPage() {
		clickButton(editbtn);
	}
	public void deletePharmacyPage() {
		clickButton(deletebtn);
	}
	public void searchPharmacy(String pharmacyname) {
		setTextElementText(searchtxt, pharmacyname);
		clickButton(searchbtn);
	}
	

}

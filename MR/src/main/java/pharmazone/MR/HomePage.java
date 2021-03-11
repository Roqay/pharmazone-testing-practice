package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="[src='/public/img/icons/doctors.png']")
	public WebElement doctorsettinglist;
	
	@FindBy(xpath="//span[contains(text(),'specialties')]")
	WebElement specialitypage;
	
	@FindBy(xpath="//span[contains(text(),'hospitals')]")
	WebElement hospitalpage;
	
	@FindBy(xpath="//*[@id=\"home-main\"]/header[1]/div[1]/div[1]/h3[1]")
	public WebElement pageheaderTxt;
	
	public void openDoctorSettingMenu() {
		clickButton(doctorsettinglist);
	}
	
	public void openHospitalPage() {
		clickButton(hospitalpage);
	}
	
	public void openSpeicalPage() {
		clickButton(specialitypage);
		
	}

}

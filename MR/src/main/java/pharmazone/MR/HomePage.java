package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
	WebElement doctorsettinglist;
	
	@FindBy(xpath="//span[contains(text(),'specialties')]")
	WebElement specialitypage;
	
	public void openDoctorSettingMenu() {
		clickButton(doctorsettinglist);
	}
	
	public void openSpeicalPage() {
		clickButton(specialitypage);
		
	}

}
package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[src='/public/img/icons/doctors.png']")
	public WebElement doctorsettinglist;

	@FindBy(xpath = "//span[contains(text(),'specialties')]")
	WebElement specialitypage;

	@FindBy(xpath = "//span[contains(text(),'hospitals')]")
	WebElement hospitalpage;

	@FindBy(xpath = "//span[contains(text(),'pharmacies')]")
	WebElement pharmacypage;
	
	@FindBy(xpath = "//*[@id=\"unifyMenu\"]/li[3]/ul[1]/li[4]/a[1]/span[1]")
	WebElement doctorspage;

	@FindBy(xpath = "//*[@id=\"home-main\"]/header[1]/div[1]/div[1]/h3[1]")
	public WebElement pageheaderTxt;

	@FindBy(xpath = "//body/div[@id='app']/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
	WebElement settingpage;
	@FindBy(xpath = "//span[contains(text(),'areas & sub')]")
	WebElement openareapage;
	@FindBy(xpath = "//span[contains(text(),'Brands')]")
	WebElement openbrandspage;
	@FindBy(xpath="//span[contains(text(),'products')]")
	WebElement openproductspage;
	
	

	public void openDoctorSettingMenu() {
		clickButton(doctorsettinglist);
	}
	
	public void openDoctorsPage() {
		clickButton(doctorspage);
	}

	public void openHospitalPage() {
		clickButton(hospitalpage);
	}
	public void openPharmacyPage() {
		clickButton(pharmacypage);
	}

	public void openSpeicalPage() {
		clickButton(specialitypage);

	}

	public void opensettingpage() {
		clickButton(settingpage);
		clickButton(openareapage);
	}

	public void openbrandspage() {
		clickButton(settingpage);
		clickButton(openbrandspage);
	}
	public void openproductpage() {
		clickButton(settingpage);
		clickButton(openproductspage);
	}


}

package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailsPage extends PageBase {

	public ProductsDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//select[@id='pline']")
	WebElement brandslist;
	@FindBy(xpath = "//input[@id='exampleInputName']")
	WebElement producttextbox;
	@FindBy(xpath = "//input[@id='exampleInputnumber']")
	WebElement skutextbox;
	@FindBy(xpath = "//input[@id='exampleInputprice']")
	WebElement pricebox;
	@FindBy(xpath = "//input[@id='exampleInputpriceaf']")
	WebElement priceafterbox;
	@FindBy(xpath = "//input[@id='exampleInputcost_price']")
	WebElement costpricebox;
	@FindBy(xpath = "//input[@id='commission']")
	WebElement Commissionbox;
	@FindBy(xpath = "//input[@id='image']")
	WebElement uploader;
	@FindBy(xpath = "//button[contains(text(),'add')]")
	WebElement addbtn;
	@FindBy(xpath = "//button[contains(text(),'save')]")
	WebElement savebtn;
	@FindBy(xpath = "//p[contains(text(),'updated successfully')]")
	public WebElement editsuccessmsg;

	public void addnewproduct(String brandname, String productname, String skunumber, String price, String priceafter,
			String cost, String Commission, String imagePath) throws InterruptedException

	{
		selectDropdownmenu(brandslist, brandname);
		setTextElementText(producttextbox, productname);
		setTextElementText(skutextbox, skunumber);
		setTextElementText(pricebox, price);
		setTextElementText(priceafterbox, priceafter);
		setTextElementText(costpricebox, cost);
		setTextElementText(Commissionbox, Commission);
		setTextElementText(uploader, imagePath);
		clickButton(addbtn);

	}

	public void editproductform() {
		clickButton(savebtn);
	}

}

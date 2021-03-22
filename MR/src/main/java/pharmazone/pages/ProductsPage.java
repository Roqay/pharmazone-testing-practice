package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Add N")
	WebElement addproductbtn;
	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]/i[1]")
	WebElement editproductbtn;
	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[2]/i[1]")
	WebElement deleteproductbtn;
	@FindBy(xpath = "//button[contains(text(),'yes')]")
	WebElement deletconfirmationmsg;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement dismisssuccessmsg;
	@FindBy(xpath = "//div[@id='swal2-content']")
	public WebElement deletesuccessmsg;
	@FindBy(xpath="//input[@type='text']")
	WebElement searchbox;
	@FindBy(xpath="//button[contains(text(),'search')]")
	WebElement searcbtn;
	@FindBy(xpath="//td[contains(text(),'Chloe')]")
	public WebElement returnproductname;
	

	public void openaddproductpage()
	{
		clickButton(addproductbtn);
	}

	public void editproduct()
	{
		clickButton(editproductbtn);
	}

	
	public void searchforproducts(String productname)
	{
		setTextElementText(searchbox, productname);
		clickButton(searcbtn);
	}

	public void deleteproduct()
	{
		clickButton(deleteproductbtn);
		clickButton(deletconfirmationmsg);
		clickButton(dismisssuccessmsg);
	}
	
}

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
	
	public void openaddproductpage()
	{
		clickButton(addproductbtn);
	}


}

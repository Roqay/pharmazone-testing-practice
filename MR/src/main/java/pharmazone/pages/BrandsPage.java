package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandsPage extends PageBase {

	public BrandsPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(partialLinkText = "Add N")
	WebElement addbrandbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]")
	WebElement editbrandbtn;
	
	public void addnewbrand()
	{
		clickButton(addbrandbtn);
	}
	
	public void editbrand()
	{
		clickButton(editbrandbtn);
	}

}

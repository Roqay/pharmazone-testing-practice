package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrandsPage extends PageBase {

	public BrandsPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(partialLinkText = "Add N")
	WebElement addbrandbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]")
	WebElement editbrandbtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/a[2]/i[1]")
	WebElement deletebrandbtn;
	@FindBy(xpath = "//button[contains(text(),'yes')]")
	WebElement confirmationalertbtn;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement dismisssuccessmsg;
	@FindBy(id="swal2-content")
	public WebElement deletesuccessmsg;
	
	
	
	
	
	
	
	
	
	
	
	public void addnewbrand()
	{
		clickButton(addbrandbtn);
	}
	
	public void editbrand()
	{
		clickButton(editbrandbtn);
		
	}
	
	public void deletebrand() throws InterruptedException
	{
		clickButton(deletebrandbtn);
		clickButton(confirmationalertbtn);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(confirmationalertbtn));
		clickButton(dismisssuccessmsg);
		
	}


}

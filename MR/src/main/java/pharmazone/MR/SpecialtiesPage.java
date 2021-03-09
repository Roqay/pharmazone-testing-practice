package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialtiesPage extends PageBase {

	public SpecialtiesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement addspcialistybtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtxt;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]")
	WebElement searchbtn;
	
	public void AddNewSpeicalPage() {
		clickButton(addspcialistybtn);
	}

}

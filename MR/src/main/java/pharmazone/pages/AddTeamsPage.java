package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTeamsPage extends PageBase{

	public AddTeamsPage(WebDriver driver) {
		super(driver);
		
	}
	 @FindBy(xpath = "//input[@id='exampleInputName']")
	    WebElement TeamNameTxt ;
	
	 @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]")
	    WebElement TeamTypeselect ;
	
	 @FindBy(xpath="//button[contains(text(),'add')]")
		WebElement addbtn;
	 
	 public void AddNewTeam (String teamname , String type ) 
	 {
		 setTextElementText(TeamNameTxt,teamname);
	
			selectDropdownmenu(TeamTypeselect, "medical rep");
	 }
	
	
}

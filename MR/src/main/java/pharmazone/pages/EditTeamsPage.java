package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTeamsPage  extends PageBase{

	public EditTeamsPage(WebDriver driver) {
		super(driver);
	}
		 @FindBy(xpath = "//input[@id='exampleInputName']]")
		    WebElement TeamNameTxt ;
		
		 @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/select[1]")
		    WebElement TeamTypeselect ;
		
		 @FindBy(xpath="//button[contains(text(),'save')]")
			WebElement addbtn;
		 
		 public void EditNewTeam (String Editname) 
		 {     TeamNameTxt.clear();
			 setTextElementText(TeamNameTxt,Editname);
		
				selectDropdownmenu(TeamTypeselect, "sales");
				clickButton(addbtn);
		 }
			 
		
		
	

}

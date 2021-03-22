package pharmazone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamsPage extends PageBase {

	public TeamsPage(WebDriver driver) {
		super(driver);
		
	}

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement SearchTeamTxt ;

    @FindBy(xpath = "//button[contains(text(),'search')]")
    WebElement SearchBtn  ; 
    
    @FindBy(xpath="//tbody/tr[1]/td[2]")
	public WebElement SearchResult; 
    
    @FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]")
    WebElement ViewSstaffBtn ; 
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/i[1]")
    WebElement EditTeamBtn ; 
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[2]/i[1]")
    WebElement DeleteTeamBtn ; 
     
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement AddTeamBtn ; 
    public void viewTeamStaff () 
    {
    	ViewSstaffBtn.click();
    } 
    public void editTeam () 
    {
    	
    	EditTeamBtn.click();
    }
    public void deleteTeam () 
    {
    	
    	DeleteTeamBtn.click();
    }

    public void addTeam () 
    {
    	
    	AddTeamBtn.click();
    }
    public void searchTeamslPage(String teamlName) {
		
    	//SearchTeamTxt.sendKeys(teamlName);
    	setTextElementText(SearchTeamTxt, teamlName);
		//SearchBtn.click
    }

    public void addTeamPage ()
    {
    	
    	AddTeamBtn.click();
    }
    public void searchTeams(String teamName) {
		
    	//SearchTeamTxt.sendKeys(teamlName); this function is in base 
    	setTextElementText(SearchTeamTxt, teamName);
		//SearchBtn.click this function is in base 
    	clickButton(SearchBtn);
		
	
	}
	
}

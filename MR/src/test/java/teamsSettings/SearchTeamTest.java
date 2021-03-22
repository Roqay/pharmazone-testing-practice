package teamsSettings;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.TeamsPage;
import shared.TestBase;

public class SearchTeamTest extends TestBase {
	LoginPage loginpageObject;
	HomePage homepageObject;
	TeamsPage teamspageObject;
    String teamName = "Marneys Medical Rep";
	
	@Test (priority = 1)
	
	public void  Searchteam() throws InterruptedException{
		
		Thread.sleep(2000);
		homepageObject=new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.teamspage));
		homepageObject.openTeamsPage();
		teamspageObject = new TeamsPage(driver);
		teamspageObject.searchTeams(teamName); 
		softassert.assertEquals(teamName,teamspageObject.SearchResult);
		
		
	}
   


















}

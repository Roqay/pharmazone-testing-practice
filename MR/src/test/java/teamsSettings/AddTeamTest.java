package teamsSettings;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pharmazone.pages.AddTeamsPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import pharmazone.pages.TeamsPage;
import shared.TestBase;

public class AddTeamTest extends TestBase {
	
	//define each page you are going to access as objects 
	LoginPage loginpageObject;
	HomePage homepageObject;
	TeamsPage teamspageObject;
	AddTeamsPage addteamsPageObject;
    //define test data 
	String teamname="new" ;
	String type="medical rep";
	
	@Test (priority = 1)
	public void addTeams() throws InterruptedException {
		
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.teamspage));
		homepageObject.openTeamsPage();

		teamspageObject= new TeamsPage(driver);
		teamspageObject.addTeamPage();
	    Thread.sleep(2000);
	    
		addteamsPageObject= new AddTeamsPage(driver);
		addteamsPageObject.AddNewTeam( teamname ,  type );
		
	
}
	/*
	@Test(priority =2)
	public void validateteamAdded() {
		teamspageObject.SearchTeams();
		softassert.assertEquals();
		
	}	
	*/
}

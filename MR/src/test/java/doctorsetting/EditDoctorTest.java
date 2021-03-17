package doctorsetting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pharmazone.pages.DoctorsPage;
import pharmazone.pages.EditDoctorsPage;
import pharmazone.pages.HomePage;
import pharmazone.pages.LoginPage;
import shared.TestBase;

public class EditDoctorTest extends TestBase{
	LoginPage loginpageObject;
	HomePage homepageObject;
	DoctorsPage doctorpageObject;
	EditDoctorsPage editdoctorobject;
	String name= faker.name().fullName();
	String speciality= "Cardiology";
	String hospital="09 clinic";
	String area="Capital Governorate";
	String category="A";
	String phone= "1234567";
	String mobile= "1234567";
	String starthour="12";
	String endhour="12";
	String offdays="Saturday";
	@Test (priority = 1)
	public void editDoctors() throws InterruptedException {
		homepageObject = new HomePage(driver);
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepageObject.doctorsettinglist));
		homepageObject.openDoctorSettingMenu();
		Thread.sleep(2000);
		homepageObject.openDoctorsPage();
		doctorpageObject= new DoctorsPage(driver);
		doctorpageObject.EditDoctorsPage();
		Thread.sleep(2000);
		editdoctorobject= new EditDoctorsPage(driver);
		editdoctorobject.editNewDoctor(name,  speciality,hospital, area,category,phone,mobile,starthour,endhour,offdays);
		
	}
	
	@Test(priority =2)
	public void validateEditedDoctor() {
		doctorpageObject.SearchDoctors(name, speciality, hospital);
		softassert.assertEquals(name,doctorpageObject.searchresult);
		
	}

}

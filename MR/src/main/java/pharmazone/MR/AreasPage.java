package pharmazone.MR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AreasPage extends PageBase {

	public AreasPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(linkText="Add New")
	WebElement AddAreaBtn;
	@FindBy(id="exampleInputNameEn")
	WebElement areatxt;
	@FindBy(css="#add-area > button")
	WebElement submitbtn;
	@FindBy(xpath="//td[contains(text(),'Nuzha Governorate')]")
	public WebElement areanametxt;
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[2]")
	WebElement deletebtn;
	@FindBy(xpath="//button[contains(text(),'yes')]")
	WebElement deletconfirmationbtn;
	@FindBy(css="#swal2-content")
	public WebElement deletsuccessmsg;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement closeconfirmationmsg;
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]/i[1]")
	WebElement editbtn;
	@FindBy(xpath="//button[contains(text(),'save')]")
	WebElement savebtn;
	@FindBy(xpath="//p[contains(text(),'saved successfully')]")
	public WebElement savemsg;
	@FindBy(xpath="//input[@type='text']")
	 WebElement searcharea;

	@FindBy(xpath="//button[contains(text(),'search')]")
	 WebElement searchbtn;
	
	@FindBy(xpath="//td[contains(text(),'Mubarak al-Kabeer Governorate')]")
	public WebElement searchresulttext;
	


	public void AddNewArea(String area)
	{
		clickButton(AddAreaBtn);
		setTextElementText(areatxt, area);
		clickButton(submitbtn);
	}
	
	
	public void EditArea(String editarea )
	{
		clickButton(editbtn);
		clearinput(areatxt);
		setTextElementText(areatxt, editarea);
		clickButton(savebtn);
	}

	public void DeleteArea() throws InterruptedException
	{
		clickButton(deletebtn);
		Thread.sleep(500);
		clickButton(deletconfirmationbtn);
		clickButton(closeconfirmationmsg);

	}
	
	public void SearchArea(String area) 
	{
		setTextElementText(searcharea, area);
		searchbtn.click();

	}
	

//

}

package pharmazone.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public Select select ; 
	public JavascriptExecutor jse ; 

	// public static Select dropdown;
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	protected static void setTextElementText(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

	protected static void clearinput(WebElement input) {
		input.clear();
	}

	protected static void selectDropdownmenu(WebElement selectvalue, String text) {
		selectvalue.click();
		Select dropdown = new Select(selectvalue);
		dropdown.selectByVisibleText(text);

	}
	public void scrollToBottom() 
		
		{
			jse.executeScript("scrollBy(0,2500)"); 
		}
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}

}

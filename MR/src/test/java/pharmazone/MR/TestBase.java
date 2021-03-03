package pharmazone.MR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.applitools.eyes.selenium.Eyes;

public class TestBase {
	protected static WebDriver driver;
	protected static Eyes eyes;
	private static Properties prop;
		
	// soft assertion method
	SoftAssert softassert = new SoftAssert();

	// Initiate the Chrome browser
	@BeforeSuite
	public void openBrowser() throws InterruptedException, Exception {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String chromeDriverPath = prop.getProperty("chromepath");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	//	System.setProperty("webdriver.chrome.driver", "resources\\ChromeDriver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://pharmazone.roqay.solutions/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		initiEyes();
	}

	// Initiate Eye apptlitool for visual testing
	private static void initiEyes() {
		eyes = new Eyes();
		// eyes.setApiKey("XaK9REdNw7MmCWtMu8xNndXETBeretnveKH2V104PT107mA110");
		eyes.setApiKey(prop.getProperty("api"));

	}

	// validate window design and elements
	public void validateWindow() {
		eyes.open(driver, "pharmazone", Thread.currentThread().getStackTrace()[2].getMethodName());
		//get image for the whole screen
		eyes.setForceFullPageScreenshot(true);
		eyes.checkWindow();
		eyes.close();
	}

//	@AfterSuite
//	public  void quitBrowser() {
//		driver.quit();
//		eyes.abortIfNotClosed();
//	}


}

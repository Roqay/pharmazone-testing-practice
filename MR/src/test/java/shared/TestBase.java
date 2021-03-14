package shared;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.applitools.eyes.selenium.Eyes;
import com.github.javafaker.Faker;

import pharmazone.pages.LoginPage;
import uitilies.Help;

public class TestBase {
	protected static WebDriver driver;
	protected static Eyes eyes;
	public static Properties prop;
	public Faker faker = new Faker();
	LoginPage loginpageObject;
	public FileInputStream fis;
	// soft assertion method
	protected SoftAssert softassert = new SoftAssert();
	
	

	// Initiate the Chrome browser
	@BeforeSuite
	public void openBrowser() throws InterruptedException, Exception {
		prop = new Properties();
		try {
			fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String chromeDriverPath = prop.getProperty("chromepath");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		/*
		 * String firefoxDriverDriverPath = prop.getProperty("firefoxpath");
		 * System.setProperty("webdriver.gecko.driver", firefoxDriverDriverPath); driver
		 * = new FirefoxDriver(); System.setProperty("webdriver.chrome.driver",
		 * "resources\\ChromeDriver\\chromedriver1.exe"); driver = new ChromeDriver();
		 * String firefoxDriverDriverPath = prop.getProperty("firefoxpath");
		 * System.setProperty("webdriver.gecko.driver", firefoxDriverDriverPath); driver
		 * = new FirefoxDriver();
		 */
		driver.get(prop.getProperty("url"));
		//driver.navigate().to("https://pharmazone.roqay.solutions/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		initiEyes();
	}

	// Initiate Eye apptlitool for visual testing
	private static void initiEyes() {
		eyes = new Eyes();
		eyes.setApiKey(prop.getProperty("api"));

	}

	@Test
	public void loginAdminSuccess() throws IOException {
		String email = prop.getProperty("admin");
		String password = prop.getProperty("password");
		loginpageObject = new LoginPage(driver);
		loginpageObject.loginAsAdmin(email, password);
		String expectedpagetitle = driver.getTitle();
		String actualtitle = "Pharma Zone - dashboard";
		softassert.assertEquals(actualtitle, expectedpagetitle);

	}

	// validate window design and elements
	public void validateWindow() {
		eyes.open(driver, "pharmazone", Thread.currentThread().getStackTrace()[2].getMethodName());
		// get image for the whole screen
		eyes.setForceFullPageScreenshot(true);
		eyes.checkWindow();
		eyes.close();
	}

	// taking screenshot for failures
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking Screenshot....");
			Help.captureScreenshot(driver, result.getName());
		}
	}

	// close browser
	@AfterSuite
	public void quitBrowser() {
		//driver.quit();
		// eyes.abortIfNotClosed();
	}

}

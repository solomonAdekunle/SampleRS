package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;

public class BaseTest {

	public static WebDriver driver;
	public static Properties OR;
	 public static Properties CONFIG = null;
	WebDriver mozilla = null;
	WebDriver chrome = null;
	WebDriver ie = null;

	public BaseTest() {
		this.creatDriver();

	}

	protected void creatDriver() {

		try {
			// initialize OR
			OR = new Properties();
			FileInputStream fs = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.properties");
			OR.load(fs);

			// initialize CONFIG to corresponding env
			CONFIG = new Properties();
			fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.properties");
			CONFIG.load(fs);

			// System.out.println(OR.getProperty("loginusername"));
			// System.out.println(CONFIG.getProperty("loginURL"));

		} catch (Exception e) {
			System.out.println("Error on intializing properties files");
		}
		if (driver == null) {

			/* Initialising WebDriver */
			String browserType = CONFIG.getProperty("browser");
			if (browserType.equals("Mozilla")) {
				BaseTest.driver = (WebDriver) new FirefoxDriver();
			} else if (browserType.equals("Chrome")) {
				// File file = new File("\\lib\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("no-sandbox");
				BaseTest.driver = (WebDriver) new ChromeDriver();
			} else if (browserType.equals("IE")) {
				// set the IE server exe path and initialize
			}

			// max
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// driver.get(CONFIG.getProperty("siteName"));
		}
	}
	public void tidyUp(Scenario s) 
	{
		 if (s.isFailed()) {
			 System.out.println("Failed");
			  }
		 else{
			 System.out.println("Passed");
		 }
		 
		 driver.quit();
	}
}

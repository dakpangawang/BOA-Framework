package baseUtil;

import java.net.URL;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;
	Configuration config;

	@BeforeMethod
	public void setUp() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NGAWANG DAKPA\\eclipse-workspace\\com.bankofamerica\\driver\\chromedriver.exe"
		 * );
		 */
		// if u wanna use gecko driver, you must have firefox browser in your system

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir")+"/driver/chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
		// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		// "/driver/geckodriver.exe");
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// driver = new EdgeDriver();
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
        // initDriver();
		config = new Configuration();

		// driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(config.getProperty(URL));
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(config.getProperty(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		homePage = new HomePage(driver);
	}
/*
	private void initDriver() {
		String browserName = config.getProperty(BROWSER);

		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case EDGE:
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			break;
		}
	}
*/

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}

package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\SeleniumWorkSpace\\Section-6_AdvanceLocators_InTestNgFrameWork\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		return driver;
	}
}

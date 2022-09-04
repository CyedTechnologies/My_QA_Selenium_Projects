package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializedDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream ("C:\\SeleniumWorkSpace\\Section-26_FrameWork\\src\\main\\java\\resources\\data.properties");
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		return driver;
	}
	// Screenshot Method 
	public void getScreenShotPath(String testMethodName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String distinationFile = System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		FileUtils.copyFile(source, new File(distinationFile));
	}
}

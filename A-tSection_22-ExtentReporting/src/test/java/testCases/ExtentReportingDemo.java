package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportingDemo {
	ExtentReports reports;
	@BeforeTest
	public void et () {
		String path = System.getProperty("user.dir")+"//reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("CyedTechnologies Reports");
		reporter.config().setDocumentTitle("CyedTechnologies Test Cases");
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "Inam");
	}
	
	@Test
	public void testCaseNo1() {
		reports.createTest("Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
		reports.flush();
		
	}

}

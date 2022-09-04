package userInterface;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section8AllinOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String [] productList = {"Cauliflower", "Cucumber", "Beetroot"};
		
		int j = 0;
		List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");
			String formatedName = productName[0].trim();
		List<String> productListArray = Arrays.asList(productList);	
			j++;
			if (productListArray.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
			if (j == productList.length);
			}
		}
		
		
	}

}

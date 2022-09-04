package testCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnvironment {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream("C:\\eclipse-workspace\\A-tSection18-TestNGFrameworkPart2\\src\\data.properties");
		prop.load(fil);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firFox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\eclipse-workspace\\A-tSection18-TestNGFrameworkPart2\\src\\data.properties");
		prop.store(fos, null);
		
	}

}

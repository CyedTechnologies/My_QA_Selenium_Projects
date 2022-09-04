package userInterface;

public class ChromeOptionsAndAllOtherBehaviour {

	public static void main(String[] args) {
		/*  https://chromedriver.chromium.org/capabilities
		
		SEE ALL THESE INFORMATION REGARDING WEBDRIVER BEHAVIOURS
		
		Using the ChromeOptions class
You can create an instance of ChromeOptions, which has convenient methods for setting ChromeDriver-specific capabilities. You can then pass the ChromeOptions object into the ChromeDriver constructor:

ChromeOptions options = new ChromeOptions();

options.addExtensions(new File("/path/to/extension.crx"));

ChromeDriver driver = new ChromeDriver(options);

Since Selenium version 3.6.0, the ChromeOptions class in Java also implements the Capabilities interface, allowing you to specify other WebDriver capabilities not specific to ChromeDriver.

ChromeOptions options = new ChromeOptions();



// Add the WebDriver proxy capability.

Proxy proxy = new Proxy();

proxy.setHttpProxy("myhttpproxy:3337");

options.setCapability("proxy", proxy);



// Add a ChromeDriver-specific capability.

options.addExtensions(new File("/path/to/extension.crx"));

ChromeDriver driver = new ChromeDriver(options);

Common use cases
Use custom profile (also called user data directory)

By default, ChromeDriver will create a new temporary profile for each session. At times you may want to set special preferences or just use a custom profile altogether. If the former, you can use the 'chrome.prefs' capability (described later below) to specify preferences that will be applied after Chrome starts. If the latter, you can use the user-data-dir Chrome command-line switch to tell Chrome which profile to use:

ChromeOptions options = new ChromeOptions();

options.addArguments("user-data-dir=/path/to/your/custom/profile");

You can create your own custom profile by just running Chrome (on the command-line or through ChromeDriver) with the user-data-dir switch set to some new directory. If the path doesn't exist, Chrome will create a new profile in the specified location. You can then modify the profile settings as desired, and ChromeDriver can use the profile in the future. Open chrome://version in the browser to see what profile Chrome is using.

Start Chrome maximized

ChromeOptions options = new ChromeOptions();

options.addArguments("start-maximized");

Using a Chrome executable in a non-standard location

ChromeOptions options = new ChromeOptions();

options.setBinary("/path/to/other/chrome/binary");

Block pop-up windows

By default, ChromeDriver configures Chrome to allow pop-up windows. If you want to block pop-ups (i.e., restore the normal Chrome behavior when it is not controlled by ChromeDriver), do the following:

ChromeOptions options = new ChromeOptions();

options.setExperimentalOption("excludeSwitches",

     Arrays.asList("disable-popup-blocking"));

Set download directory

The following code can be used to configure Chrome to download files to a specific directory. However, there are several caveats to be aware of:

Chrome disallows using certain directories for download. In particular, you cannot use the desktop folder as the download directory. On Linux, you also cannot use the home directory for download. Since the exact list of forbidden directories is subject to change, it is recommended that you use a directory that has no special meaning to the system.

ChromeDriver does not automatically wait for download to complete. If you call driver.quit() too soon, Chrome might terminate before the download has finished.

Relative paths do not always work. For best result, use full path instead.

On Windows, Use "\" as path separators. Using "/" is not reliable on Windows.

ChromeOptions options = new ChromeOptions();

Map<String, Object> prefs = new HashMap<String, Object>();

prefs.put("download.default_directory", "/directory/path");

options.setExperimentalOption("prefs", prefs);
		
		
		*/
	}

}

package section13;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySetUp {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		
	}

}

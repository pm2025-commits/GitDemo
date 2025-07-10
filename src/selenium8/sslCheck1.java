package selenium8;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslCheck1 {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		option.setCapability("proxy",proxy);
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("download.default_directory", "directory/path");
		
		option.setAcceptInsecureCerts(true);
		
	//	FirefoxOptions option = new FirefixOptions();
		
		WebDriver driver = new ChromeDriver(option);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        
        
		
		
		
	}

}

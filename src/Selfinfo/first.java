package Selfinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) {
		//invoking browser
		//chrome - chromedriver exten ->method close get
		//firefox - firefox driver ->method close get
		//safaridriver saaridrier ->method close get
		//webdriver close get
		//webdriver methods+class methods
		
		System.out.println("hello");
		//chromedriver.exe ->chrome browser
		
//		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chrome-headless-shell-win64 (2)");
//		
//		//webdriver.chrome.driver ->value of path
//      WebDriver driver = new ChromeDriver();
//      driver.get("https://rahulshettyacademy.com/");
//      System.out.println(driver.getTitle());
//      System.out.println(driver.getCurrentUrl());
//      driver.close();
//      driver.quit();
      
      //firefox launch
      //geckodriver
//      System.getProperty("webdriver.gecko.driver","E:\\newfile\\geckodriver-v0.36.0-win-aarch64");
//      WebDriver driver= new FirefoxDriver();
//      driver.get("https://rahulshettyacademy.com/");
//      System.out.println(driver.getTitle());
//      System.out.println(driver.getCurrentUrl());
//      driver.close();
      
      //EDGEDRIVER
		System.setProperty("webdriver.edge.driver", "E:\\newone\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
    //  driver.close();
      
       
      
      
      
      
	}

}

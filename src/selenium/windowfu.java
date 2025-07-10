package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowfu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		// driver.get("http://google.con");
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().back();
		 driver.navigate().forward();
		 
	}

}

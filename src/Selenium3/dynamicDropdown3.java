package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    
		// a[@value='MAA'] :-XPTH for chennai
		//a[@value='BLR']  :-XPATH FO RBENGALURU
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 //ANOTHER WYA TO LOCATE XPTH ITS AN PROFESSHINAL WAY IN COMPANY
	//	driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active ")).click();  
	}

}

package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chrome-headless-shell-win64 (2)");
	
		
		//webdriver.chrome.driver ->value of path
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      driver.findElement(By.id("inputUsername")).sendKeys("Prasanna");
      driver.findElement(By.name("inputPassword")).sendKeys("Prasanna@123");
      driver.findElement(By.className("signInBtn")).click();
      System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
      driver.findElement(By.linkText("Forgot your password?")).click();
      Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
 /*    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prasannamath3@gmail.com");
     driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7744938442");
   */
      
 /*    driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("John");
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("prasannamath3@gmail.com");
     driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9172829218");
*/
      
     // driver.findElement(By.xpath("input[placeholder='Email']")).clear();
      driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("prasannamath30@gmail.com"); 
      driver.findElement(By.xpath("//form/input[3]")).sendKeys("7744938442");
    
     
      
      
      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
      driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
      Thread.sleep(1000);
      
      System.out.println(driver.findElement(By.cssSelector("form p")).getText());
      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Prasanna");
      driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
      driver.findElement(By.id("chkboxOne")).click();
      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
     
      

}
}

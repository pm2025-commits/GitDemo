package selenium6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLink {

	public static void main(String[] args) throws InterruptedException {
		//1 give me count of links on the page
		//2 count the footer section 
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1
		System.out.println(driver.findElements(By.tagName("a")).size());
	    //2
		WebElement footerDriver=driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footerDriver.findElement(By.tagName("a")).getSize());
		
		//3 count the first column links
		WebElement columndriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on each link of that column & check the pages are opening
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(3000L);
		}
		
		//OPENS ALL THE TABS AT SEPERATELY
		 Set<String> abc=driver.getWindowHandles();
		Iterator <String> it = abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}

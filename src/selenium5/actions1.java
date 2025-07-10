package selenium5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1 {
 //daubt here

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chrome-headless-shell-win64 (2)");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions abc = new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
abc.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//DOUBLE CLICK ON SELECTED LETTER
abc.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		//move to specific element
		abc.moveToElement(move).contextClick().build().perform();
	}

}

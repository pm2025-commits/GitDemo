package selenium7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> SECONFrOW=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(SECONFrOW.get(0).getText());
		System.out.println(SECONFrOW.get(1).getText());
		System.out.println(SECONFrOW.get(2).getText());


	}

}

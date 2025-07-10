package selenium4;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int j=0;
		String[] itemneeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
				

		Thread.sleep(3000);
		
		List<WebElement> prodcuts =driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<prodcuts.size();i++)
		{
			//brocolli - 1kg
			//brocolli,  1kg 
			String[] name=prodcuts.get(i).getText().split("-");
			String formattedName= name[0].trim();
			
			//this is an example of amazon interview qwestion
			//format it to get actual vegetable name
			//covert array into arraylist for each search
			//check whether name you extracted is present in arraylist or not
			
			List itemsNeededList = Arrays.asList(itemneeded);
 			
 				j++;
 				//click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemneeded.length)
				{
					break;
				}
			}
		}

	}



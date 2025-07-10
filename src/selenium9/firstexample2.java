package selenium9;

import java.net.MalformedURLException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class firstexample2 {
  
	public static void main(String[] args) {
		
		   
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
				//click on column
				
				driver.findElement(By.xpath("//tr/th[1]")).click();
				
				//capture all the webelements into list
				List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
				
				
				//capture text of all the webelement  into the new (original)list
				List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
				
				//sort on the original list of step3-> sorted list
				List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
				
				//compare original list & sorted list
				Assert.assertTrue(originalList.equals(sortedList));
				
				List<String> price;
				//scan the name of column with getText->'rice'->print the price of Rice
				do
				{
					List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
					price = rows.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s)).collect(Collectors.toList());
					price.forEach(a -> System.out.println(a));

					if(price.size()<1)
					{
					driver.findElement(By.cssSelector("[aria-label='Next']")).click();
					}
					}while(price.size()<1);

					}
				
		     		private static String getPriceVeggie(WebElement s) {

					// TODO Auto-generated method stub

					String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
					return pricevalue;

					}
	}


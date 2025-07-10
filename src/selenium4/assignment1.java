package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy ");
		 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		 driver.findElement(By.cssSelector("input[id='usertype']")).click();
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		 driver.findElement(By.id("okayBtn")).click();
		 
		 WebElement options=driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select form= new Select(options);
		 form.selectByValue("Teacher");
		// form.selectByValue("Consultant");
		 driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		 List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		 for(int i =0;i<products.size();i++)

		 {

		 products.get(i).click();

		 }

		 driver.findElement(By.partialLinkText("Checkout")).click();}

	}


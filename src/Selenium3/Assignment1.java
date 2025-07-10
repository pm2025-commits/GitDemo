package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Prasanna");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("prasannamathane3@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("pradipsavarkar");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(staticDropdown);
		gender.selectByVisibleText("Male");
		System.out.println(gender.getFirstSelectedOption().getText());
		gender.selectByVisibleText("Female");
		System.out.println(gender.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("30/02/1998");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		

	}

}

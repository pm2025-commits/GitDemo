package section16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
 
public class day3 {
    
	
	@BeforeMethod
	public void beforerecovery()
	{
		System.out.println("I will execute before every test method in class 3");
	}
	
	@Test(groups= {"Smoke"})
	public void webLogisthekey()
	{
		System.out.println("thirdKey");
	}
	@AfterMethod
	public void afterrecovery()
	{
		System.out.println("I will execute after every test method in class 3");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I will execute before evry class");
	}
	
	//@Parameters({"URL"})
	@Test
	public void webLogicCarLoan()
	{
		System.out.println("webLogicCarLoan");
		//System.out.println(uname);
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will execute after every class");
	}
	
	
	@Test
	public void mobileLogicCarLoan()
	{
		System.out.println("mobileLogicCarLoan");
	}
	
	@Test
	public void mobileSignIN()
	{
		System.out.println("mobileSignIN");
	}
	
	@Test(dataProvider="getData")
	public void mobileSignOut(String username, String password)
	{
		System.out.println("mobileSignOut");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(timeOut=4000)
	
		public void mobileSignOutxaar()
		{
			System.out.println("mobilesingput");
	}
	public void apiLogicCarLoan()
	{
		System.out.println("apiLogicCarLoan");
	}
	
	@Test(dependsOnMethods= {"webLogicCarLoan","mobileSignOut"})
	public void apiLogic()
	{
		System.out.println("apiLogic");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination- username ,password -good credit history=row
		//2nd usernmae,password - no credit history
		//3rd frudalent credit history
		
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//columns in the row are nothing but the values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
		
		
		
		
	}
}

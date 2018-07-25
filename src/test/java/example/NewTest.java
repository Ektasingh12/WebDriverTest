package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;		
import org.testng.annotations.Test;

import com.google.errorprone.annotations.Var;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	public String baseURL ="http://demo.guru99.com/test/guru99home/";

	public WebDriver driver;	
		@Test				
		public void testEasy() {
			
			
			System.out.println("launching firfox");
			  System.setProperty("webdriver.gecko.driver", "C://Users//sam//Music//ekta//geckodriver.exe");
			  driver= new FirefoxDriver();
			  driver.get(baseURL);
			  String expectedTitle ="Demo Guru99 Page";
			  String actualTitle = driver.getTitle();
			  Assert.assertEquals(actualTitle, expectedTitle);
			system.out.println("ekta singh");
			  
			  
				
		}	
		
		
		

		//@BeforeTest
		//public void beforeTest() {	
		//    driver = new FirefoxDriver();  
		//}	
		
		@AfterTest
	public void afterTest() {
		driver.quit();			
		}		
}








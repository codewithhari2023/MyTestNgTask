package mymainpackage;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import base.getting_functionalities;
public class MyInputFile {


	  // Load the properties file
	  // Assuming the properties file is named "testnginputs.properties" and located in the same directory as this class
	  // Adjust the path as necessary
	  // Note: Ensure that you have the necessary imports for WebDriver and Properties
	  // Also, ensure that you have the correct WebDriver setup (e.g., ChromeDriver, GeckoDriver, etc.)
	@Test
	 
	  public void f() throws Exception {
		  FileReader fr=new FileReader("C:\\Users\\hariprasath.r\\Downloads\\TaskTestNg\\vinothacademy\\testnginputs.properties");
		  
		
	 
	Properties p = new Properties();
		  p.load(fr);
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
			
		  getting_functionalities gu=new  getting_functionalities(driver);	
		gu.openingurl(p.getProperty("url"));
		gu.fillingNamefields(p.getProperty("fname"), p.getProperty("lname"));
     	gu.fillingRadiosandCheckboxesfields();
		gu.fillingAddressfields(p.getProperty("address"), p.getProperty("street"), p.getProperty("state"), 
				p.getProperty("city"), p.getProperty("zipcode"), p.getProperty("country"));
		gu.fillingPersonalfields(p.getProperty("date"), p.getProperty("email"), p.getProperty("phone"), p.getProperty("query"), p.getProperty("verify"));
         gu.clicksubmit();

	}
}

package base;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class getting_functionalities {
	WebDriver driver;
	 public getting_functionalities(WebDriver driver) {
		  this.driver = driver;
	  }

  @Test
  public void openingurl(String url) {
	  driver=new ChromeDriver();
	 driver.get(url);
	  
	 
  }
  @Test
  public void fillingNamefields(String fname, String lname) {
	WebElement Fname=driver.findElement(By.id("vfb-5"));
	Fname.sendKeys(fname);
	WebElement Lname=driver.findElement(By.id("vfb-7"));
	Lname.sendKeys(lname);
  }
  @Test
  public void fillingAddressfields(String address, String street, String state, String city, String zipcode, String country) {
		WebElement Address=driver.findElement(By.id("vfb-13-address"));
		Address.sendKeys(address);
		WebElement Street=driver.findElement(By.id("vfb-13-address-2"));
		Street.sendKeys(street);
		WebElement State=driver.findElement(By.id("vfb-13-state"));
		State.sendKeys(state);
		WebElement City=driver.findElement(By.id("vfb-13-city"));
		City.sendKeys(city);
		WebElement Zipcode=driver.findElement(By.id("vfb-13-zip"));
		Zipcode.sendKeys(zipcode);
		WebElement SelectCountry=driver.findElement(By.id("vfb-13-country"));
		Select countryselect= new Select(SelectCountry);
		countryselect.selectByVisibleText(country);
		
	  }
  @Test
  public void fillingPersonalfields(String date, String email, String phone, String query, String verify) {
		WebElement Date=driver.findElement(By.id("vfb-18"));
		Date.sendKeys(date);
		WebElement Email=driver.findElement(By.id("vfb-14"));
		Email.sendKeys(email);
		WebElement Mobile=driver.findElement(By.id("vfb-19"));
		Mobile.sendKeys(phone);
		WebElement Query=driver.findElement(By.id("vfb-23"));
		Query.sendKeys(query);
		WebElement Verify=driver.findElement(By.id("vfb-3"));
		Verify.sendKeys(verify);
		
	  }
  @Test
  public void fillingRadiosandCheckboxesfields( ) {
		WebElement Gender=driver.findElement(By.id("vfb-31-1"));
		Gender.click();
	  }

public void clicksubmit() {
	  WebElement Submit=driver.findElement(By.name("vfb-submit"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", Submit);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.elementToBeClickable(Submit));
	  Submit.click();
  }

}

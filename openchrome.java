package firstDemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mymainpackage.MyInputFile;

public class openchrome {
	
  @Test
  public void open() throws Exception {
	  MyInputFile mif=new MyInputFile();
	  mif.f();
  }  
  

}

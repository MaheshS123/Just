package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Neostox {
  @Test
  public void NeostoxTest() 
  {
	  Reporter.log("Opning Neostox",true);
	  System.setProperty("webdriver.chrome.driver","D:\\javaSelenium\\chromedriver.exe");

		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(CO);
		driver.get("https://neostox.com/");
		driver.quit();
  }
}

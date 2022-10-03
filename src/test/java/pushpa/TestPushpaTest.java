package pushpa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPushpaTest {
  @Test
  public void imddaterealse ()
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit\\eclipse\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		
		imdhomepage imd = new imdhomepage(driver);
		
		driver.get("https://www.imdb.com/");
		imd.entersearchtext("Pushpa : The Rise ");
		imd.submitbutton();
		imd.linktext();
		imd.Daterelease();
		imd.Country();
  }
  @Test
  public void wikidaterealse () 
  {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit\\eclipse\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
	    
		wikihomepage wiki = new wikihomepage(driver);
		driver.get("https://en.wikipedia.org/wiki/Wiki");
		wiki.entersearchtext("Pushpa: The rise");
		wiki.searchbutton();
		wiki.Daterelease();
		wiki.Country();
		
		System.out.println("Both the Test cases are run successfully.");
		Reporter.log("TC is Passed", true);
  }
}

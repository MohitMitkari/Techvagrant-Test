package pushpa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPushpa {

	public static void main(String[] args) 
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
		
		
		
		

	}

}

package pushpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class imdhomepage {

	
		WebDriver driver;
		imdhomepage(WebDriver d)
		{
		driver= d;
		}
      By search = By.name("q");
      By submitButton = By.xpath("//button[@type=\"submit\"]");
      By linktext = By.linkText("Pushpa: The Rise - Part 1");
      By Daterelease = By.xpath("(//a[@class=\"ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link\"])[24]");
      By Country = By.xpath("(//div[@class=\"ipc-metadata-list-item__content-container\"])[18]");
		public void entersearchtext (String pushpaTherise)
		{
			driver.findElement(search).sendKeys(pushpaTherise);
		}
		public void submitbutton ()
		{
			driver.findElement(submitButton).click();
		}
		public void linktext ()
		{
			driver.findElement(linktext).click();
		}
		public void Daterelease ()
		{
			String Date = driver.findElement(Daterelease).getText();
			System.out.println(Date);
		}	
		public void Country ()
		{
			String country = driver.findElement(Country).getText();
			System.out.println(country);
		}	
	}



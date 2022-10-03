package pushpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wikihomepage {
	
	WebDriver driver;
	wikihomepage(WebDriver d)
	{
	driver= d;
	}

	By search = By.name("search");
	By searchbutton = By.id("searchButton");
	By date =By.xpath("(//div[@class=\"plainlist\"])[4]");
	By country =By.xpath("(//td[@class=\"infobox-data\"])[12]");
	
	public void entersearchtext (String pushpaTherise)
	{
		driver.findElement(search).sendKeys(pushpaTherise);
	}
	public void searchbutton ()
	{
		driver.findElement(searchbutton).click();
	}
	
	public void Daterelease ()
	{
		String releaseDate = driver.findElement(date).getText();
		System.out.println(releaseDate);
	}
	public void Country ()
		{
			String countryname = driver.findElement(country).getText();
			System.out.println(countryname);
	}	
	}



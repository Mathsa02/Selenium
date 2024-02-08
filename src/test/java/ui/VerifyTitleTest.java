package ui;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	@Test
	public void titleTest()
	{
		String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext ="Search";
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.ebay.com/");
		 String actualtitle = driver.getTitle();
		 System.out.println("Verifying title");
		 Assert.assertEquals(actualtitle, expectedtitle, "Text verification failed");
		 String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		 System.out.println("Verifying text");
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("closing browser");
		driver.close();
	}

}

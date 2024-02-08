package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {
	WebDriver driver;
	@Test

	public void Addtocart1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		
		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchBar.sendKeys("iphone15");
	
		
		WebElement buttonSearch = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		buttonSearch.click();	
		
		driver.get("https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX2F5QT/ref=sr_1_1_sspa?crid=NVOBOBYMRPDM&keywords=iphone+15&qid=1707123022&sprefix=iphone15%2Caps%2C274&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
		addToCart.click();
		Thread.sleep(4000);
		
		driver.close();	
	}
}

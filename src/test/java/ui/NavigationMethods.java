package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
	WebDriver driver;
    @Test
	public void dropdown() throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		Thread.sleep(3000);
	
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();		

	}

}

package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	WebDriver driver;
	@Test
    public void mouse() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(4000);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"))).click().build().perform();
		
		driver.navigate().back();
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("pen drive").doubleClick().build().perform();
		//a.doubleClick(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")));
		Thread.sleep(4000);
		
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"))).contextClick().build().perform();
		a.contextClick(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"))).build().perform();
		Thread.sleep(4000);
		
		driver.close();
		
	}

}

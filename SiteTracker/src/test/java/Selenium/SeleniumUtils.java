package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Runner.BaseTest;

public class SeleniumUtils {

	WebDriver driver;

	private void createDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangeetha\\Documents\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
	}
	
   
	private void openBrowser(String url) {
		driver.get(url);
		WebDriverWait wait= new WebDriverWait(driver,30);
		//By element= By.xpath("//a[@title='']");
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	
	public void startup(String browser,String url) {
		createDriver(browser);
		openBrowser(url);	
		
	}

}

package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Enums.UrlEnum.urls;

public class SeleniumUtils {

	WebDriver driver;

	private void createDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", urls.CHROME_PATH.getLabel());
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
	}

	private void openBrowser(String url) {
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		// By element= By.xpath("//a[@title='']");
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}

	public void startup(String browser, String url) {
		createDriver(browser);
		openBrowser(url);
	}

	private String[] getIdentifierAndLocator(String expression) {
		return expression.split("#");
	}

	private WebElement getObject(String expression) {

		String identifier = getIdentifierAndLocator(expression)[0];
		String locator = getIdentifierAndLocator(expression)[1];

		if (identifier.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locator));
		} else if (identifier.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(locator));
		} else if (identifier.equalsIgnoreCase("tagName")) {
			return driver.findElement(By.tagName(locator));
		}else if(identifier.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locator));
		}
		
		return null;
	}

	private List<WebElement> getObjects(String expression) {

		String identifier = getIdentifierAndLocator(expression)[0];
		String locator = getIdentifierAndLocator(expression)[1];

		if (identifier.equalsIgnoreCase("xpath")) {
			return driver.findElements(By.xpath(locator));
		} else if (identifier.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(locator));
		} else if (identifier.equalsIgnoreCase("tagName")) {
			return driver.findElements(By.tagName(locator));
		}else if (identifier.equalsIgnoreCase("css")) {
			return driver.findElements(By.cssSelector(locator));
		}
		return null;

	}

	public void click(String element) {
		WebElement object = getObject(element);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", object);
	}

	public void selectFromTypeAhead(String element, String sElement, String data) {
		WebElement object = getObject(element);
		object.sendKeys(data);
		List<WebElement> elements = getObjects(sElement);
		for (WebElement obj : elements) {
			if (obj.getText().equalsIgnoreCase(data)) {
				obj.click();
				break;
			}
		}
	}

	public void selectFromDropDown(String element, String sElement, String data) {

		WebElement object = getObject(element);
		object.click();
		List<WebElement> elements = getObjects(sElement);
		for (WebElement obj : elements) {
			if (obj.getText().equalsIgnoreCase(data)) {
				obj.click();
				break;
			}
		}

	}
	
	
	public void UpdateTable(String element) {
		WebElement object = getObject(element);
		List<WebElement> elements=object.findElements(By.tagName("td"));
		
		
	}
	
	
	

}

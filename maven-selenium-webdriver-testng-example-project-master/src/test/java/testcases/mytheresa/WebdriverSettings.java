package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		String exePath = "./E2EUserJourney/geckodriver";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ReadProperties;

public class Driver extends ReadProperties {
	public static WebDriver driver;
	public static String chromeDriverPath;

	public void setDriver(String browserType, String appURL) {
		if (browserType.equalsIgnoreCase("Firefox")) {
			initFirefox();
		} else if (browserType.equalsIgnoreCase("Chrome")) {
			initChromeDriver(chromeDriverPath);
		}
		setDriverProperty();
		driver.get(appURL);
	}

	public void initFirefox() {
		driver = new FirefoxDriver();

	}

	public void initChromeDriver(String chromeDriverPath) {
		System.setProperty("webdriver.chrome.driver", "chromeDriverPath");
		driver = new ChromeDriver();
	}

	public void setDriverProperty() {
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;

	}

}

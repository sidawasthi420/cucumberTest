package hooks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class browserHooks {

	public static WebDriver driver = null;
	
	@Before
	public void launchBrowser() throws InterruptedException, MalformedURLException
	{
		boolean seleniumGrid = Boolean.parseBoolean(ConfigReader.getProperty("seleniumGrid"));
		String gridURL = ConfigReader.getProperty("gridURL");
		
		if (seleniumGrid) {
	        // Use Selenium Grid
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("chrome");
	        driver = new RemoteWebDriver(new URL(gridURL), capabilities);
	    } else {
	        // Use local ChromeDriver
	        driver = new ChromeDriver();
	    }

	    driver.manage().window().maximize();
	    Thread.sleep(4000);

	}
	
	@After
	public void closeBrowser() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(6000);
	}
}

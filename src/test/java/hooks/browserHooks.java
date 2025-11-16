package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class browserHooks {

	public static WebDriver driver = null;
	
	@Before
	public void launchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
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

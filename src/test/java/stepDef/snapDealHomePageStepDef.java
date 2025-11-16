package stepDef;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.browserHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class snapDealHomePageStepDef {

	@And("Launch the url {string}")
	public void launchURL(String url)
	{
		browserHooks.driver.get(url);
	}
	
	@When("User is on the Home page")
	public void userHomePage()
	{
		System.out.println("User is on homepage validated");
	}
	
	@And("Dismiss the popover if displayed")
	public void dismissPopover(DataTable dtb)
	{
		List<List<String>> test = dtb.asLists();
		System.out.println(test.get(0));
		System.out.println(test.get(0).get(0));
		System.out.println(test.get(1).get(0));
	}
}

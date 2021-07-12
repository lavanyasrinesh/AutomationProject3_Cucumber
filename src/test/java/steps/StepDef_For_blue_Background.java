package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SkyBlue_BackgroundPage;
import util.BrowserFactory;

public class StepDef_For_blue_Background {
	
	WebDriver driver;
	SkyBlue_BackgroundPage skyblue;
	
	@Before
	public void lanchBrowser() {
		driver=BrowserFactory.init();
		skyblue=PageFactory.initElements(driver, SkyBlue_BackgroundPage.class);
	}
	
	@Given("^User can able to land on given url$")
	public void user_can_able_to_land_on_given_url()  {
		driver.get("https://techfios.com/test/101/");
		
	}

	@When("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists()  {
		skyblue.skybluebuttonExist();
	}

	@When("^I click on the button$")
	public void i_click_on_the_button()  {
		skyblue.clickingtheButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		skyblue.validatetheColor();
	}

	@After
	public void closingBrowser() {
		BrowserFactory.tearDown();
	}

}

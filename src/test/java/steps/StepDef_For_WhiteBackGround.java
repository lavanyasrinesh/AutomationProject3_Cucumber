package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SkyWhite_BackgroundPage;
import util.BrowserFactory;

public class StepDef_For_WhiteBackGround {
	WebDriver driver;
	SkyWhite_BackgroundPage white;

	@Before
	public void lanchBrowser() {
		driver=BrowserFactory.init();
		white = PageFactory.initElements(driver, SkyWhite_BackgroundPage.class);
	}
	
	@Given("^User can able to land on the  given url$")
	public void user_can_able_to_land_on_the_given_url() throws Throwable {
		driver.get("https://techfios.com/test/101/");
	}


	@When("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		white.skyWhitebuttonExist();
	}

	@When("^I click on the  White button$")
	public void i_click_on_the_White_button() throws Throwable {
		white.clickingtheButton();
	}

	@Then("^the background color will change to skyWhite$")
	public void the_background_color_will_change_to_skyWhite() throws Throwable {
		white.validatetheColor();
	}
	
	@After
	public void closingBrowser() {
		BrowserFactory.tearDown();
	}
}

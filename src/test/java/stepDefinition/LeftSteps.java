package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LeftPage;

public class LeftSteps {

	LeftPage leftPage = new LeftPage();
	
	@Given("user enters the page")
	public void user_enters_the_page() {
		leftPage.OpenChromeDriver();
	}

	@When("user press the alert button")
	public void user_press_the_alert_button() {
		leftPage.PressAlertButton();
	}

	@And("user confirm the alert")
	public void user_confirm_the_alert() {
		leftPage.ConfirmAlert();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		leftPage.TearDownTest();
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		leftPage.SampleLoginPage();
	}

	@When("user press login button")
	public void user_press_login_button() {
		leftPage.PressLoginButton();
	}
}

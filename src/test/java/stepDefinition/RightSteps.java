package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RightPage;

public class RightSteps {
	
	RightPage rightPage = new RightPage();
	
	@Given("I navigate to the Try Testing This page")
	public void i_navigate_to_the_try_testing_this_page() {
		rightPage.OpenChromeDriver();
	}

	@And("I enter username and password")
	public void i_enter_username_and_password() {
		rightPage.TypingName();
	}

	@And("I select the gender")
	public void i_select_the_gender() {
		rightPage.SelectGender();
	}

	@And("I select only one option")
	public void i_select_only_one_option() {
		rightPage.SelectAnOption();
	}

	@And("I  select multiple options")
	public void i_select_multiple_options() {
		rightPage.SelectMultipleOptions();
	}

	@And("I chose applicable options")
	public void i_chose_applicable_options() {
		rightPage.SelectApplicableOptions();
	}

	@When("I scroll page")
	public void i_scroll_page() {
		rightPage.ScrollPage();
	}

	@And("I typing an answer")
	public void i_typing_an_answer() {
		rightPage.TypingAndSelect();
	}

	@And("I select a color")
	public void i_select_a_color() {
		rightPage.SelectColor();
	}

	@And("I select a date")
	public void i_select_a_date() {
		rightPage.SelectDate();
	}
	
	@And("I scroll range value")
	public void i_scroll_range_value() {
		rightPage.RangeSlider();
	}

	@And("I select a file")
	public void i_select_a_file() {
		rightPage.ChooseFile();
	}

	@And("I select a quantity")
	public void i_select_a_quantity() {
		rightPage.QuantityRange();
	}

	@And("I typing a long message")
	public void i_typing_a_long_message() {
		rightPage.LongMessage();
	}

	@And("I press the submit button")
	public void i_press_the_submit_button() {
		rightPage.SubmitButton();
	}
	
	@And("I close the tab")
	public void i_close_the_tab() {
		rightPage.CloseTab();
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		rightPage.TearDownTest();
	}
}

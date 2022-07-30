package step.definition;

import PageObjects.HomePageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Util;


public class HomePageStepDefinition extends Base {
	HomePageObject homePage = new HomePageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		homePage.userOnHomepage();
		logger.info("user on homePage");
		Util.takeScreenShot();
		
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrncy();
		
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.clickOnEuro();
		logger.info("user click on euro");
		
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.euroCurrency();
		logger.info("User See The Euro Currency");
		Util.takeScreenShot();
		
	}
	// *************Shopping Cart************///

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCart();
		logger.info("user click on shopping cart");
		

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePage.shoppCartIsEmpty();
		Util.takeScreenShot();
		

	}
}

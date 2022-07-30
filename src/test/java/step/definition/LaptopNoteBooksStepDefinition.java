package step.definition;

import org.junit.Assert;

import PageObjects.LaptopNoteBooksPageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Util;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopPage = new LaptopNoteBooksPageObject();

	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		laptopPage.clickeOnTestEnvironment();
		logger.info("user clicked on Retail website");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab()  {
		laptopPage.clickOnlaptopNotebooksTab();
		logger.info("user clicked on laptop &NoteBook tab");
		
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopPage.clickOnshowAllLaptopsNoteBooks();
		logger.info("user click on show all Laptop &NoteBook option");
		
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopPage.clickeOnMacBookitem();
		logger.info("user click on MacBook item");
		
	}

	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book()  {
		laptopPage.clickToAddToCart();
		logger.info("user Add MacBook To Cart");
		
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string)  {
		laptopPage.theSuccessMassage();
		logger.info("user can see success text");
		

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptopPage.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
	
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopPage.ClickOnCartOption();
		logger.info("user click on item Button");
		
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopPage.clickOnRemovetheitems();
		logger.info("user can click on remove button");
		
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		laptopPage.noItemsAddtothecart();
		logger.info("user see their is no items add to the cart");
		Util.takeScreenShot();
	}

	///////////// Scenario: Product Comparison////////////////
	@When("User click on product comparison icon onn {string}")
	public void user_click_on_product_comparison_icon_on(String string)  {
	
		laptopPage.clickOnProductComparisonMacBook();
		logger.info("macbook product comparison button clicked");
		
	}

	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_onn(String string) {
		laptopPage.clickOnProductComparisonMacBookAir();
		logger.info("user click on macbookAir comparison button");
		
	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String string) {
		laptopPage.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfull to product comparison");
		
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopPage.clickOnproductComprison();
		logger.info("user can click on product comparison");
		
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopPage.productCompareItem();
		logger.info("user can see items in product compare chart");
		Util.takeScreenShot();
	}

	///////////// Adding an item to Wish list//////////////
	@When("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list() {
		laptopPage.clickOnwishbutton();
		logger.info("user add Sony VaIO to wish list");
		
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		laptopPage.youMustLogin();
		logger.info("user need to login to his account");
		
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopPage.clickOnwishbutton();
		Util.takeScreenShot();
	}
	/////// Scenario: Validate the price of MacBook Pro is '2000'/////

	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopPage.clickOnMacBookPro();
		logger.info("user click on macBook Pro");
		
	}
	
	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	
		laptopPage.userCanSeeThePrice$2000();
		logger.info("user can see the price is $2000");
		Util.takeScreenShot();

	}

}

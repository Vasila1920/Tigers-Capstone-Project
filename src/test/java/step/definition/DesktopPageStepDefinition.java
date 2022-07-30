package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import PageObjects.DesktopPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Util;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktopsPage = new DesktopPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab()  {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");
		

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops()  {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
		
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page()  {

		String expextedText = "Desktops";
		String actualText = desktopsPage.ShowDesktopText();
		Assert.assertEquals(expextedText, actualText);
		logger.info("Dektops text was was verified successfully ");
	}
	
	
		@When("User click  ADD TO CART option on HP LP3065 item")                                //LP3065
		public void user_click_add_to_cart_option_on_hp_lp3065_item()  {
			desktopsPage.clickOnHPAddToCart();
			logger.info("User clicked on add to card Option on HP LP3065");
			

	}                                                            
	

	@When("User select quantity {string}")
	public void user_select_quantity(String quantity)  {
		desktopsPage.selectQuantity(quantity);
		logger.info("user enter quantity ");
		
		
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button()  {
		desktopsPage.addtocart();
		logger.info("User clicked on Add to cart Button");
		
		
	}
                                    
	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String string)  {
		desktopsPage.successTextIsDisplay();
        logger.info("User can see success text");
	    Util.takeScreenShot();
	}


                            ///canon////
	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item()  {
		desktopsPage.clickOnCanonAddToCard();
		logger.info("User click  ADD TO CART option on Canon EOS 5D item");
		
		
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red()  {
		desktopsPage.selectColor();
		logger.info("User select color from dropdown Red");
		
	} 

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item()  {       
		desktopsPage.ClickOnCanon();
		logger.info("User click on Canon EOS 5D item");     
		
		
	}
	@When("User click add to Cart buttonn")
	public void user_click_add_to_cart_buttonn() {
		desktopsPage.addtocart();
		logger.info("User clicked on Add to cart Button");
		
	}
		@Then("User should see a messages {string}")
		public void user_should_see_a_messages(String string)  {
			desktopsPage.successTextIsDisplay();
	        logger.info("User can see success text");
		    Util.takeScreenShot();

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link(){
		desktopsPage.clickOnWriteAReviewLink();
		logger.info("User click on write a review link");
		
		
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			 {
		List<Map<String, String>> infoList = dataTable.asMaps(String.class, String.class);
		desktopsPage.SelectName(infoList.get(0).get("youname"));
		desktopsPage.sendReview(infoList.get(0).get("reviewtext"));
		desktopsPage.selectRatingRadioButton(); 
		
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button()  {
		desktopsPage.clickOncontunioButton();
		logger.info("user click on continue Button");
		
		
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string)  {
		desktopsPage.reviewmessageisdisplay();
		logger.info("user can see the message");
		Util.takeScreenShot();
	}


}

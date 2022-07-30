package step.definition;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import PageObjects.RetailPageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Util;

public class RetailStepDefinition extends Base {
	RetailPageObject retailWebPage = new RetailPageObject();
	
	@Given("user is on Retail home Page")
	public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailWebPage.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Text Test Environment was verified");
	}


	@When("user click on MyAccount")
	public void user_click_on_my_account() {
		retailWebPage.clickOnMyAccount();
		logger.info("user clicked on MyAccount");

	}

	@When("user click on Login option")
	public void user_click_on_login_option() {
		retailWebPage.clickOnLogin();
	logger.info("user clicked on login");

	}

	@When("user enter userName {string}  and password {string}")
	public void user_enter_user_name_and_password(String emaill, String pass) {
		retailWebPage.enterEmail(emaill);
		logger.info("user entered the userName" );            
		retailWebPage.enterPassword(pass);
		logger.info("user entered the password" );             

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		retailWebPage.clickOnLoginButton();
		logger.info("user clicked on login button");

	}

	@Then("user should be logged into myAccount Page")
	public void user_should_be_logged_into_my_account_page() {
		String expectedText = "My Account";
		String ActualText = retailWebPage.getTextAfterLogin();
		Assert.assertEquals(expectedText, ActualText);
		logger.info("My Account text was verified successfully");
		

	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailWebPage.clickOnRegisterForAffiliatAccount();
		logger.info("user clicked on register for an Affiliate Account");
		
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable)
			 {
		List<Map<String, String>> Affiliate = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterCompanyName(Affiliate.get(0).get("company"));
		retailWebPage.enterWebSite(Affiliate.get(0).get("website"));
		retailWebPage.enterTaxId(Affiliate.get(0).get("taxID"));
		retailWebPage.choosePaymentMethod(Affiliate.get(0).get("paymentMethod"));
		retailWebPage.chequePayeeName(Affiliate.get(0).get("payeeName"));
		
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box()  {
		retailWebPage.clickOnAboutUsButton();
		logger.info("user clicked on about us box");
	
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button()  {
		retailWebPage.clickOnContinueButton();
		logger.info("user clicked on continue button");
		
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailWebPage.successTextIsDisplay();
		logger.info("user can see success text");
		Util.takeScreenShot();
	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink()  {
		retailWebPage.clickOnEditYourAffiliateInformation();
		logger.info("user click on edit affiliate info");
		

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button()  {
		retailWebPage.clickOnPayMethodBank();
		logger.info("user choosed bank transfer");
		

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			 {
		List<Map<String, String>> BankInfo = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterBankName(BankInfo.get(0).get("bankName"));
		retailWebPage.enterBankBranch(BankInfo.get(0).get("abaNumber"));
		retailWebPage.enterBankSwiftCode(BankInfo.get(0).get("swiftCode"));
		retailWebPage.enterBankAccountName(BankInfo.get(0).get("accountName"));
		retailWebPage.enterBankAccountNamber(BankInfo.get(0).get("accountNumber"));
		Util.takeScreenShot();

	}
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailWebPage.clickOnEditYourInfo();
		logger.info("user clicked on edit account info" );

	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable)  {
		List<Map<String, String>> AccountInfo = dataTable.asMaps(String.class, String.class);
		retailWebPage.enterFirstName(AccountInfo.get(0).get("firstname"));
		retailWebPage.enterLastName(AccountInfo.get(0).get("lastName"));
		retailWebPage.enterEmail(AccountInfo.get(0).get("email"));
		retailWebPage.enterTelephone(AccountInfo.get(0).get("telephone"));
		

	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		retailWebPage.EditAccountInfoSuccessMessage();
		logger.info("Edit Account info Success Message is displayed!");
		Util.takeScreenShot();
	}



}

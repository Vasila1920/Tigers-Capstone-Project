package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	
@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
private WebElement testEnvironmentText;
@FindBy(xpath = "//span[text()='My Account']")
private WebElement myAccount;
@FindBy(xpath ="//a[normalize-space()='Login']")
private WebElement loginButton;
@FindBy(id = "input-email")
private WebElement enterEmail;
@FindBy(id = "input-password")
private WebElement passwordField;
@FindBy(xpath = "//input[@value='Login']")
private WebElement clickOnLogin;
@FindBy(xpath = "//h2[text()='My Account']")
private WebElement myAccountText;
//===================================================login

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliatAccount;
	@FindBy(id = "input-company")
	private WebElement companyName;
	@FindBy(id = "input-website")
	private WebElement websiteinput;
	@FindBy(id = "input-tax")
	private WebElement taxIdinput;
	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement clickOnPayMethodCheque;
	@FindBy(id = "input-cheque")
	private WebElement chequepayeeName;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement clicknAgreeButton;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickOnContinue;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successTextIsDisplay;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateinfo;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement clickOnPayMethodBank;
	@FindBy(id = "input-bank-name")
	private WebElement enterBankName;
	@FindBy(id = "input-bank-branch-number")
	private WebElement enterBankBranch;
	@FindBy(id = "input-bank-swift-code")
	private WebElement enterBankSwiftCode;
	@FindBy(id = "input-bank-account-name")
	private WebElement enterBankAccountName;
	@FindBy(id = "input-bank-account-number")
	private WebElement enterBankAccountNamber;
	//===========================================================Register affiliate
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement clickOnEditYourInfo;
	@FindBy(id = "input-firstname")
	private WebElement enterFirstName;
	@FindBy(id = "input-lastname")
	private WebElement enterLastName;
	@FindBy(id ="input-telephone")
	private WebElement enterTelephone;
	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successMessageEditAccountInfo;
	
	public String getTestEnvironmentText() {
		String textFromUI = testEnvironmentText.getText();
		return textFromUI;
	}


public void clickOnLogin() {
	loginButton.click();
}

	
public String getTextAfterLogin() {
	String myAccountText = myAccount.getText();
	return myAccountText;
}


	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLoginButton() {
		clickOnLogin.click();
	}


	public void clickOnRegisterForAffiliatAccount() {
		registerForAffiliatAccount.click();
	}

	public void enterCompanyName(String companyNameEnter) {
		companyName.sendKeys(companyNameEnter);
	}

	public void enterWebSite(String WebSitelink) {
		websiteinput.sendKeys(WebSitelink);
	}

	public void enterTaxId(String TaxIdInput) {
		taxIdinput.sendKeys(TaxIdInput);
	}

	public void choosePaymentMethod(String PayMethodCheque) {
		clickOnPayMethodCheque.click();
	}

	public void chequePayeeName(String PayeeNameInput) {
		chequepayeeName.sendKeys(PayeeNameInput);

	}

	public void clickOnAboutUsButton() {
		clicknAgreeButton.click();
	}

	public void clickOnContinueButton() {
		clickOnContinue.click();

	}

	public void successTextIsDisplay() {
		successTextIsDisplay.isDisplayed();

	}

	public void clickOnEditYourAffiliateInformation() {
		editYourAffiliateinfo.click();
	}

	public void clickOnPayMethodBank() {
		clickOnPayMethodBank.click();
	}


	public void enterBankName(String EnterBankName) {
		enterBankName.sendKeys(EnterBankName);
	}

	public void enterBankBranch(String EnterBankBranch) {
		enterBankBranch.sendKeys(EnterBankBranch);
	}

	public void enterBankSwiftCode(String EnterBankSwiftCode) {
		enterBankSwiftCode.sendKeys(EnterBankSwiftCode);
	}

	public void enterBankAccountName(String EnterBankAccountName) {
		enterBankAccountName.sendKeys(EnterBankAccountName);
	}

	public void enterBankAccountNamber(String EnterBankAccountNamber) {
		enterBankAccountNamber.sendKeys(EnterBankAccountNamber);
	}
	public void clickOnEditYourInfo() {
		clickOnEditYourInfo.click();
	}
	public void enterFirstName(String firstNameValue) {
		enterFirstName.clear();
		enterFirstName.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		enterLastName.clear();
		enterLastName.sendKeys(lastNameValue);
	}
	
	public void enterEmail(String emailValue) {
		enterEmail.clear();
		enterEmail.sendKeys(emailValue);
		
	}

	public void enterPassword(String passValue) {
		passwordField.sendKeys(passValue);
	}
	
	public void enterTelephone(String telephoneValue) {
		enterTelephone.clear();
		enterTelephone.sendKeys(telephoneValue);
	}
	public void EditAccountInfoSuccessMessage() {
		successMessageEditAccountInfo.isDisplayed();
	}


}

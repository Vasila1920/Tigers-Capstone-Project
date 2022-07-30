package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;

    @FindBy(xpath = "//h2[text()= 'Desktops']")
    private WebElement desktopText;
	
	@FindBy(xpath = "//a[normalize-space()='HP LP3065']")                                               //HP3065
	private WebElement addToCartHP;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityField;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addTOCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]")   //Canon
	private WebElement addToCartCanon;

	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")                                
	private WebElement dropdownRed;             
    
    @FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")                                                  //review
	private WebElement ClickOnCanonEOS5D;                                      

	@FindBy(xpath = "//a[normalize-space()='Write a review']")   
	private WebElement clickOnWriteAReviewLink;

	@FindBy(id = "input-name")
	private WebElement yourName;

	@FindBy(xpath = "//*[@id='input-review']")
	private WebElement reviewTextBox;

	@FindBy(xpath = "//input[@name='rating' and @value='5']")
	private WebElement ratingRadionButton;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOncontunioButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewmessageisdisplay;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart;

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}

	public void clickOnShowAllDesktops() {
		ShowAllDesktops.click();
	}


	public String ShowDesktopText () {
		String DesktopText = desktopText.getText();
		return DesktopText;
	}
			
	public void clickOnHPAddToCart() {
		addToCartHP.click();
	}

	public void selectQuantity(String input) {              
		quantityField.clear();
		quantityField.sendKeys(input);
	}

	public void clickOnQuantityButton() {                   
		addTOCartButton.click();
	}

	public void successTextIsDisplay() {
		successMessage.isDisplayed();
    }

    public void clickOnCanonAddToCard() {                         //add Canon
		addToCartCanon.click();
	}

	public void selectColor() {
		dropdownRed.click();
	}


	public void ClickOnCanon() {                                  //Review
		ClickOnCanonEOS5D.click();  
	}

	public void clickOnWriteAReviewLink() {                  
		clickOnWriteAReviewLink.click();
	}

	public void SelectName(String string) {
		yourName.sendKeys("Vasila Rakhmakulova");

	}

	public void sendReview(String review) {
		reviewTextBox.sendKeys(review);
	}

	public void selectRatingRadioButton() {
		
		ratingRadionButton.click();
	}

	public void clickOncontunioButton() {
		clickOncontunioButton.click();
	}

	public void reviewmessageisdisplay() {
		reviewmessageisdisplay.isDisplayed();
	}

	public void addtocart() {
		addtocart.click();
	}
}

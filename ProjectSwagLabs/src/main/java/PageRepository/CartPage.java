package PageRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement FirstProductCart;
	
	
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement CheckoutBtn;
	
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement OpenMenu;
	
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement FName;
	
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement LName;
	
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement Zipcode;
	
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ContinueBtn;
	
	
	@FindBy(xpath = "//div[@id='checkout_summary_container']")
	private WebElement CheckoutDescription;
	
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement FinishBtn;
	
	
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement ThankyouMsg;
	
	
	@FindBy(xpath = "//button[text()='Back Home']")
	private WebElement BackToHomeBtn;
	
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement Logout;
	
	
	
	
	
	
	
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	
	
	


	public WebElement getFirstProductCart() {
		return FirstProductCart;
	}
	
	
	public WebElement getCheckoutBtn() {
		return CheckoutBtn;
	}


	public WebElement getOpenMenu() {
		return OpenMenu;
	}
	
	
	public WebElement getLogout() {
		return Logout;
	}


	public WebElement getFName() {
		return FName;
	}


	public WebElement getLName() {
		return LName;
	}


	public WebElement getZipcode() {
		return Zipcode;
	}


	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getCheckoutDescription() {
		return CheckoutDescription;
	}

	public WebElement getFinishBtn() {
		return FinishBtn;
	}

	public WebElement getThankyouMsg() {
		return ThankyouMsg;
	}
	
}

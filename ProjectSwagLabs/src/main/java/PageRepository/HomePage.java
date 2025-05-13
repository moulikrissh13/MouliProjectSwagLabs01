package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	private WebElement HomePageTitle;
	
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/child::a")
	private WebElement CartBtn;
	
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement OpenMenu;
	
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement Logout;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Firstproduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Secondproduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Thirdproduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Fourthproduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Fifthproduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Sixthproduct;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement FirstProductLink;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement SecondProductLink;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement ThirdProductLink;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement FourthProductLink;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement FifthProductLink;
	
	
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement SixthProductLink;
	
	
	
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	
	
	
	

	public WebElement getHomePageTitle() {
		return HomePageTitle;
	}



	public WebElement getOpenMenu() {
		return OpenMenu;
	}



	public WebElement getLogout() {
		return Logout;
	}



	public WebElement getFirstproduct() {
		return Firstproduct;
	}


	public WebElement getSecondproduct() {
		return Secondproduct;
	}



	public WebElement getThirdproduct() {
		return Thirdproduct;
	}



	public WebElement getFourthproduct() {
		return Fourthproduct;
	}


	public WebElement getFifthproduct() {
		return Fifthproduct;
	}


	public WebElement getSixthproduct() {
		return Sixthproduct;
	}


	public WebElement getCartBtn() {
		return CartBtn;
	}


	public WebElement getFirstProductLink() {
		return FirstProductLink;
	}


	public WebElement getSecondProductLink() {
		return SecondProductLink;
	}


	public WebElement getThirdProductLink() {
		return ThirdProductLink;
	}


	public WebElement getFourthProductLink() {
		return FourthProductLink;
	}


	public WebElement getFifthProductLink() {
		return FifthProductLink;
	}


	public WebElement getSixthProductLink() {
		return SixthProductLink;
	}
	
}

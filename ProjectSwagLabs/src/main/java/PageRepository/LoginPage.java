package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement LoginBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}



	public WebElement getUsername() {
		return Username;
	}



	public WebElement getPassword() {
		return Password;
	}



	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	
}


package GenericUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageRepository.CartPage;
import PageRepository.HomePage;
import PageRepository.LoginPage;
import PropertiesLibrary.PropertiesFile;

public class BasicConfig {

	public WebDriver driver;
	public PropertiesFile propobj;
	
	
	//1. Open the browser
	@Parameters("browser")
	@BeforeClass
	public void browserOpen(String browserName) {
//		String browserName="chrome";
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		

		
		// Maxmizing the browser
		driver.manage().window().maximize();
		
		Reporter.log("Browser opened", true);
		
		
		//2.1 Navigating to the application
		 propobj = new PropertiesFile();
		driver.get(propobj.readData("url"));
//		driver.get("https://www.saucedemo.com/");
		Reporter.log("Navigated to the application", true);
		

		//2.2 Verify login page is displayed
		String exp_title = "Swag Labs";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
		Reporter.log("Login Page displayed", true);
		
	}
	
	//2. Navigate
	@BeforeMethod
	public void Login() {
		
		
	
		
		//providing waiting statements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		//3.1 Enter username in the username textfield
		LoginPage login = new LoginPage(driver);
		login.getUsername().sendKeys(propobj.readData("username"));
//		login.getUsername().sendKeys("standard_user");
		Reporter.log("Username is: "+propobj.readData("username"), true);
		
		
		//3.2 Enter password in the password textfield
		login.getPassword().sendKeys(propobj.readData("password"));
//		login.getPassword().sendKeys("secret_sauce");
		Reporter.log("Password is: "+propobj.readData("password"), true);
		
		
		//3.3 Click on "login" button
		login.getLoginBtn().click();
		Reporter.log("Login button clicked", true);
	}
	
	
	//9 Click on "Logout" button
	@AfterMethod
	public void Logout() {
		
		CartPage cart = new CartPage(driver);
		cart.getOpenMenu().click();
		cart.getLogout().click();
		Reporter.log("Logout suucessful", true);
	}
	
	
	//10 Close the browser
	@AfterClass
	public void browserClose() {
		
		driver.quit();
		Reporter.log("Browser closed", true);
	}
	
	
	
	

	
}





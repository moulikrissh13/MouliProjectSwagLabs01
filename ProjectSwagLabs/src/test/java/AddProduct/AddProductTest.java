package AddProduct;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ExcelLibrary.ExcelFiles;
import GenericUtility.BasicConfig;
import PageRepository.CartPage;
import PageRepository.HomePage;

public class AddProductTest extends BasicConfig {

	
	
	@Test
	public void addproduct() {
		
		//Handling Notification popup
//		driver.switchTo().alert().accept();
		
		
		//4. Verify homepage is displayed
		HomePage home = new HomePage(driver);
		String exp_title = "Swag Labs";
		String act_title = home.getHomePageTitle().getText();
		Assert.assertEquals(act_title, exp_title);
		Reporter.log("Home page is displayed", true);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//5.1 Click on 2nd product
		home.getSecondProductLink().click();
		
		//5.2 Click on 2nd product "Add to cart" button
		home.getSecondproduct().click();
		Reporter.log("Product clicked", true);
		
		//5.3 Click on the "Cart" icon
		home.getCartBtn().click();
		Reporter.log("Clicked on cart button", true);
		
		//5.4 Verfiy product is added to cart
		CartPage cart = new CartPage(driver);
		if (cart.getFirstProductCart().isDisplayed()) {
			Reporter.log("Product is dispalyed", true);
		} else {
			Reporter.log("Product is not dispalyed", true);
		}
//		driver.switchTo().alert().accept();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//6.1 Click on "Checkout" button
		cart.getCheckoutBtn().click();
		
		
		//6.2 Enter first name in First name textfield
		ExcelFiles excel = new ExcelFiles();
		cart.getFName().sendKeys(excel.readExcelData("Credentials", 1, 0));
		Reporter.log("First name added", true);
		
		
		//6.3 Enter last name in Last name textfield
		cart.getLName().sendKeys(excel.readExcelData("Credentials", 1, 1));
		Reporter.log("Last name added", true);
		
		
		//6.4 Enter zipcode in zipcode textfield
		cart.getZipcode().sendKeys(excel.readExcelData("Credentials", 1, 2));
		Reporter.log("Zipcode added", true);
		
		
		//6.5 Click on "Continue" button
		cart.getContinueBtn().click();
		
		
		//7.1 Verify the product is displayed
		if(cart.getCheckoutDescription().isDisplayed()) {
			
		String details = cart.getCheckoutDescription().getText();
		System.out.println("==============================================");
		System.out.println(details);
		System.out.println("=============================================="); 
//		 for(int i=0; i<count;i++) {
//			 String	 details = cart.getCheckoutDescription().get(i).getText();
//			 System.out.println(details);
//		 }
		 Reporter.log("Checkout description is dispalyed", true);
		 
		} else {
			Reporter.log("Checkout description not dispalyed", true);
		}
		
		
		//7.2 Click on "Finish" button
		cart.getFinishBtn().click();
		
		
		
		//8 Verify the product is palced
		if (cart.getThankyouMsg().isDisplayed()) {
			String message = cart.getThankyouMsg().getText();
			
			System.out.println("==============================================");
			System.out.println(message);
			System.out.println("=============================================="); 
			
			 Reporter.log("Thank you message is dispalyed", true);
		} else {
			 Reporter.log("Thank you message not dispalyed", true);
		}
		
		
		
		
		
		
		 Reporter.log("Hurrrraayyyyyy!!!!! Your product is placed", true);
	}
	
	
	
	
}

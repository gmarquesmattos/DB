package Step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ServicesTest.BrowserServices;
import ServicesTest.Validator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddProductCart {
	String mainWindow;

	
	@When("^Click the Add to cart button$")
	public void click_the_Add_to_cart_button(BrowserServices browserServices) throws Throwable {

		browserServices.browser.findElement(By.id("add_to_cart")).click();

		confirmation_and_open_window(browserServices);

	}

	@Then("^Confirmation and open window$")
	public void confirmation_and_open_window(BrowserServices browserServices) throws Throwable {

		mainWindow = browserServices.SelectPopUpService();
	

		
		
		
		
		browserServices.browser.findElement(By.linkText("Proceed to checkout")).click();

		ValidationProductCar vc = new ValidationProductCar();
		vc.i_m_on_the_main_page(browserServices);

	}

}

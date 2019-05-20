package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ServicesTest.BrowserServices;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidationProductCar {
	String mainWindow;

	@Given("^I'm on the main page$")
	public void i_m_on_the_main_page(BrowserServices browserServices) throws Throwable {

		mainWindow = browserServices.SelectPopUpService();

		i_check_the_cart(browserServices);
	}

	@When("^I check the cart$")
	public void i_check_the_cart(BrowserServices browserServices) throws Throwable {

		product_selected_successfully(browserServices);

	}

	@Then("^Product selected successfully$")
	public void product_selected_successfully(BrowserServices browserServices) throws Throwable {

		SingIn si = new SingIn();
		si.main_page(browserServices);
	}

}

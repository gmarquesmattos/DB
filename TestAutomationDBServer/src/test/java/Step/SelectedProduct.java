package Step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectedProduct {
	String mainWindow;

	@Given("^I'm on the homepage$")
	public void i_m_on_the_homepage(BrowserServices browserServices) throws Throwable {

		i_choose_a_product(browserServices);
	}

	@When("^I choose a product$")
	public void i_choose_a_product(BrowserServices browserServices) throws Throwable {

		browserServices.browser.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();

		selected_Product(browserServices);

	}

	@Then("^Selected Product$")
	public void selected_Product(BrowserServices browserServices) throws Throwable {

		

		AddProductCart apc = new AddProductCart();

		apc.click_the_Add_to_cart_button(browserServices);

	}

}

package Step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingIn {

	String mainWindow;

	@Given("^main page$")
	public void main_page(BrowserServices browserServices) throws Throwable {

		click_Sing_in(browserServices);

	}

	@When("^Click Sing in$")
	public void click_Sing_in(BrowserServices browserServices) throws Throwable {

		browserServices.browser.findElement(By.className("header_user_info")).click();

		success_register_page(browserServices);

	}

	@Then("^success register page$")
	public void success_register_page(BrowserServices browserServices) throws Throwable {

		mainWindow = browserServices.SelectPopUpService();

		UserRegistration ur = new UserRegistration();
		ur.cick_the_Create_an_account_button(browserServices);

	}

}

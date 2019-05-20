package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.When;

public class Payment {
	String mainWindow;

	@When("^I choose payment$")
	public void i_choose_payment(BrowserServices browserServices) throws Throwable {

		String mainWindow = browserServices.SelectPopUpService();

		System.out.println("pagamento");

		browserServices.browser.findElement(By.className("bankwire")).click();

		i_want_to_proceed(browserServices);
	}

	@When("^I want to proceed$")
	public void i_want_to_proceed(BrowserServices browserServices) throws Throwable {

		String mainWindow = browserServices.SelectPopUpService();

		WebElement menu = browserServices.browser.findElement(By.linkText("Women"));
		Actions actions = new Actions(browserServices.browser);
		actions.moveToElement(menu).perform();

		System.out.println("Moveu SIM");

		browserServices.browser.findElement(By.id("cart_navigation"))
				.findElement(By.className("button btn btn-default button-medium")).click();

	}

}

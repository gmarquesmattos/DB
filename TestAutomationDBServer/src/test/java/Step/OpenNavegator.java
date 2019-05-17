package Step;

import ServicesTest.BrowserServices;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OpenNavegator {

	@Given("^loading the browser$")
	public void loading_the_browser() throws Throwable {

		BrowserServices browserServices = new BrowserServices();

		browserServices.OpenBrowserService();

		// inserir_Login(browserServices);
		page_opened_successfully(browserServices);
	}

	@Then("^Page opened successfully$")
	public void page_opened_successfully(BrowserServices browserServices) throws Throwable {

		SelectedProduct sp = new SelectedProduct();

		sp.i_m_on_the_homepage(browserServices);

	}

}

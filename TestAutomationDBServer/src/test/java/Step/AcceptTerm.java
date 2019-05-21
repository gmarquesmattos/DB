package Step;

import org.openqa.selenium.By;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcceptTerm {
	String mainWindow;

	@When("^I select term$")
	public void i_select_term(BrowserServices browserServices) throws Throwable {
		
		mainWindow = browserServices.SelectPopUpService();
		
		browserServices.browser.findElement(By.id("uniform-cgv")).click();
	
		to_Process(browserServices);
	}

	@Then("^To Process$")
	public void to_Process(BrowserServices browserServices) throws Throwable {
	
	
		mainWindow = browserServices.SelectPopUpService();
		browserServices.browser.findElement(By.name("processCarrier")).click();
	
		
	ValidationOfValue vov = new ValidationOfValue();
		
		vov.i_check_the_values(browserServices);
	
	
	}

	// BrowserServices browserServices

//	uniform-cgv

}

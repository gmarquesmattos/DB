package Step;

import org.openqa.selenium.By;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidationOfValue {

	@When("^I check the values$")
	public void i_check_the_values(BrowserServices browserServices) throws Throwable {

		
	
	correct_value(browserServices);
	}

	@Then("^Correct value$")
	public void correct_value(BrowserServices browserServices) throws Throwable {
	
	
		Payment p = new Payment();
	
	p.i_choose_payment(browserServices);
	}


}


package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.ws.message.EmptyMessageImpl;

import ServicesTest.BrowserServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.x509.GeneralName;
import ServicesTest.GeneratorString;

public class UserRegistration {
	String mainWindow;
	Select oSelect;
	GeneratorString g = new GeneratorString();

	@When("^Cick the Create an account button$")
	public void cick_the_Create_an_account_button(BrowserServices browserServices) throws Throwable {

		String mainWindow = browserServices.SelectPopUpService();

		browserServices.browser.findElement(By.name("email_create")).sendKeys(g.Email() + "@test.com");

		browserServices.browser.findElement(By.id("SubmitCreate")).click();

		page_accessed_successfully(browserServices);
	}

	@Then("^Page accessed successfully$")
	public void page_accessed_successfully(BrowserServices browserServices) throws Throwable {

	

		page_from_user(browserServices);
	}

	@Given("^Page from user$")
	public void page_from_user(BrowserServices browserServices) throws Throwable {

		mainWindow = browserServices.SelectPopUpService();

		browserServices.browser.findElement(By.id("uniform-id_gender1")).click();
		browserServices.browser.findElement(By.name("customer_firstname")).sendKeys(g.GerName2());
		browserServices.browser.findElement(By.name("customer_lastname")).sendKeys(g.LastName());
		browserServices.browser.findElement(By.id("passwd")).sendKeys("123123");
	

		//////////////////////////////// Day////////////////////////////////////////////
		Select oSelect = new Select(browserServices.browser.findElement(By.id("days")));
		oSelect.selectByIndex(1);

		//////////////////////////////////// months///////////////////////////////////////////////

		Select oSelect1 = new Select(browserServices.browser.findElement(By.id("months")));
		oSelect1.selectByIndex(2);

		///////////////////////////////// years//////////////////////////////////////////////////
		Select oSelect2 = new Select(browserServices.browser.findElement(By.id("years")));
		oSelect2.selectByIndex(3);

		browserServices.browser.findElement(By.id("company")).sendKeys("Mattos S/A");

		browserServices.browser.findElement(By.id("address1")).sendKeys("capitão pedroso");
	

		browserServices.browser.findElement(By.id("city")).sendKeys("Los Angeles");
		
		Select oSelect3 = new Select(browserServices.browser.findElement(By.id("id_state")));
		oSelect3.selectByIndex(5);
		System.out.println("Postal");
		browserServices.browser.findElement(By.id("postcode")).sendKeys("21606");

		browserServices.browser.findElement(By.id("other")).sendKeys(g.ObsContract());

		browserServices.browser.findElement(By.id("phone")).sendKeys("555133152146");

		browserServices.browser.findElement(By.id("phone_mobile")).sendKeys("555199215447");

		browserServices.browser.findElement(By.id("alias")).sendKeys("xxxxxxxxxxx");

	
		to_register(browserServices);

	}

	@When("^to register$")
	public void to_register(BrowserServices browserServices) throws Throwable {

		browserServices.browser.findElement(By.id("submitAccount")).click();

		customer_successfully_registered(browserServices);

	}

	@Then("^customer successfully registered$")
	public void customer_successfully_registered(BrowserServices browserServices) throws Throwable {

	
		i_verify_the_address(browserServices);

	}

	@When("^I verify the address$")
	public void i_verify_the_address(BrowserServices browserServices) throws Throwable {

		to_process(browserServices);

	}

	@Then("^to process$")
	public void to_process(BrowserServices browserServices) throws Throwable {
		
		mainWindow = browserServices.SelectPopUpService();
		browserServices.browser.findElement(By.linkText("Proceed to checkout")).click();
		
		mainWindow = browserServices.SelectPopUpService();
		browserServices.browser.findElement(By.name("processAddress")).click();
		

	
		AcceptTerm at = new AcceptTerm();

		at.i_select_term(browserServices);
	}



}

package stepDefinition;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;

import ObjectManager.PageObjectManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FormPage;
import utilities.BaseClass;

public class FormFillStepsDefiniton {

	WebDriver driver;
	String url = "https://seleniumautomationpractice.blogspot.com/2021/06/automation-sample-1-abhresh.html";
	String browser = "Chrome";
	PageObjectManager objManager;
	BaseClass baseClass;
	FormPage formPage;

	@Given("^I launch the application URL$")
	public void i_launch_the_application_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		objManager = new PageObjectManager();
		baseClass = objManager.getBaseClass(driver);
		this.driver=baseClass.openBrowser(browser);
		baseClass.openAUT(url);

	}

	@When("^I enter the details in the form page$")
	public void i_enter_the_details_in_the_form_page(DataTable table) throws Throwable {

		formPage = objManager.getFormPage(driver);
		List<Map<String, String>> forms = table.asMaps(String.class, String.class);
		for (Map<String, String> form : forms) {

			formPage.enterFormDetails(form.get("firstname"), form.get("Lastname"), form.get("address"),
					form.get("nationality"), form.get("gender"), form.get("interest"));
		}

	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		
		formPage = objManager.getFormPage(driver);
		formPage.submitForm();

	}

	@Then("^an alert for successful submission should be displayed$")
	public void an_alert_for_successful_submission_should_be_displayed() throws Throwable {

		formPage = objManager.getFormPage(driver);
		baseClass = objManager.getBaseClass(driver);
		formPage.acceptAlert();
		baseClass.browserShutDown();

	}
}

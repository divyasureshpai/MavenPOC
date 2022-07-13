package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class FormPage {

	WebDriver driver;
	BaseClass baseClass;
	By fName = By.xpath("//input[@id='ts_first_name']");
	By lName = By.xpath("//input[@id='ts_last_name']");
	By address = By.xpath("//textarea[@id='ts_address']");
	By nationality = By.xpath("//select[@id='ts_country']");
	By genderMale = By.xpath("//input[@value='male']");
	By genderfemale = By.xpath("//input[@value='female']");
	By cricket = By.id("ts_checkbox1");
	By football = By.id("ts_checkbox2");
	By hockey = By.id("ts_checkbox3");
	By submitForm = By.name("Submit1");
	By cookies = By.id("cookieChoiceDismiss");

	public FormPage(WebDriver driver) {

		this.driver = driver;
		baseClass = new BaseClass(driver);
	}

	public void enterFormDetails(String fname, String lname, String addr, String nation, String gender,
			String interest) {

		// driver.findElement(cookies).click();
		baseClass.click(cookies);
		baseClass.enterText(fname, fName);
		baseClass.enterText(lname, lName);
		baseClass.enterText(addr, address);
		baseClass.selectFromDropDown(nation, nationality);
		if (gender.equalsIgnoreCase("male")) {
			baseClass.click(genderMale);
		} else if (gender.equalsIgnoreCase("female")) {
			baseClass.click(genderfemale);
		} else {
			System.out.println("Invalid gender provided!!");
		}
		if (interest.equalsIgnoreCase("cricket")) {
			baseClass.click(cricket);
		} else if (interest.equalsIgnoreCase("football")) {
			baseClass.click(football);
		} else if (interest.equalsIgnoreCase("hockey")) {
			baseClass.click(hockey);
		} else {
			System.out.println("invalid interest provided!!");
		}

	}

	public void submitForm() {

		baseClass.click(submitForm);
	}

	public void acceptAlert() {

		baseClass.alertAccept();
	}
}

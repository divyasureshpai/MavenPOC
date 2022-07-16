package ObjectManager;

import org.openqa.selenium.WebDriver;

import pageObjects.FormPage;
import utilities.BaseClass;

public class PageObjectManager {
	
	WebDriver driver;
	FormPage formPage;
	BaseClass baseClass;
	
//	public PageObjectManager(WebDriver driver) {
//		
//		this.driver=driver;
//	}
	
	public FormPage getFormPage(WebDriver driver) {
		
		return(formPage==null)? formPage=new FormPage(driver):formPage;
	}
	
	public BaseClass getBaseClass(WebDriver driver) {
		
		return(baseClass==null)?baseClass=new BaseClass(driver):baseClass;
	}

}

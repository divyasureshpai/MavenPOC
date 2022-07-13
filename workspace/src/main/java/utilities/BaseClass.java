package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	WebDriver driver;
	Select select;
	Alert alert;
	
	public BaseClass(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebDriver openBrowser(String browser) {
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\lib\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\src\\main\\resources\\lib\\msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid broswer");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		catch (Exception e) {

			System.err.println("Unable to launch browser");
		}
		
		return driver;
		
	}
	public void openAUT(String url) {
		
		try {
			
			driver.get(url);
		}
		catch(Exception e) {
			
			System.err.println("error occures while launching url");
		}
		
	}
	public void browserShutDown() {
		driver.quit();
	}

	public void closeWindow() {
		driver.close();
	}
	public void click(By locValue) {
		try{
			driver.findElement(locValue).click();
		}catch(Exception e) {
			System.err.println("Unable to click on the webelement:"+locValue);
		}
	}
	public void enterText(String text,By locValue) {
		try {
			driver.findElement(locValue).clear();
			driver.findElement(locValue).sendKeys(text);
		}catch(Exception e) {
			System.err.println("Unable enter text on the webelement:"+locValue);
		}
	}
	public void selectFromDropDown(int indexNumber,By locValue) {
		try {
			select=new Select(driver.findElement(locValue));
			select.selectByIndex(indexNumber);
			
		}catch(Exception e) {
			System.err.println("Unable select the webelement by index:"+locValue);
		}
	}
	public void selectFromDropDown(String visibleText,By locValue) {
		try {
			select=new Select(driver.findElement(locValue));
			select.selectByVisibleText(visibleText);
			
		}catch(Exception e) {
			System.err.println("Unable select the webelement:"+locValue);
		}
	}
	public void alertAccept() {
		
		try {
			
			alert=driver.switchTo().alert();
			alert.accept();
			
		}
		catch(Exception e) {
			
			System.err.println("No alert present");
		}
	}

}

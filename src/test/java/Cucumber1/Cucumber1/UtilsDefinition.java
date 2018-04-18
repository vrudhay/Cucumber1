package Cucumber1.Cucumber1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;

public class UtilsDefinition {
	
	WebDriver objDriver = null;
	
	@Then("^I launch OM$")
	public void user_prints() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		objDriver = new ChromeDriver();
		objDriver.get("http://www.google.com");
		System.out.println("Page launched");
	}
	
	@Then("^I print one$")
	public void just_print() {
		System.out.println("Printed One");
	}

}

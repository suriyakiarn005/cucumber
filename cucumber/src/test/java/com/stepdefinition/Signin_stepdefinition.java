package com.stepdefinition;

import java.time.Duration;

import com.Baseclass.Baseclass;
import com.pom.Pom1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin_stepdefinition extends Baseclass {
	Pom1 p1 = new Pom1();
	
	@Given("launch the URL of the application")
	public void launch_the_url_of_the_application() {
	   driver.get("https://vmmaps.com/vrs/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@When("Click on the sigin button in the page")
	public void click_on_the_sigin_button_in_the_page() {
	   click(p1.getSignin());
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("Enter the registered email address")
	public void enter_the_registered_email_address() {
	sendKeys(p1.getEmailaddress(),"suriyakiran005@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("Enter the correct password")
	public void enter_the_correct_password() {
sendKeys(p1.getPassword(),"Suriya@123");
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@Then("Click on the signin button")
	public void click_on_the_signin_button() {
	    click(p1.getLoginbutton());
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}	
}

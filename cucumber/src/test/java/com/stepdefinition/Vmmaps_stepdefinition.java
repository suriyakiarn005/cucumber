package com.stepdefinition;


import java.time.Duration;


import com.Baseclass.Baseclass;
import com.pom.Pom;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vmmaps_stepdefinition extends Baseclass{
	Pom p = new Pom();
	
	
	
	@Given("Launch the URL")
	public void launch_the_url() {
	   driver.get("https://vmmaps.com/vrs/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Click on the sign up button")
	public void click_on_the_sign_up_button() {
	  click(p.getSignup());
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@And("Enter the full name")
	public void enter_the_full_name() {
	    sendKeys(p.getFullname(),"Suriya");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@And("Enter the email address")
	public void enter_the_email_address() {
	
	sendKeys(p.getEmailaddress(),"suriyakiran005@gmail.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@And("Enter the mobile number")
	public void enter_the_mobile_number() {
	   sendKeys(p.getMobilenumber(),"1234567871");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@And("Enter the password for vmmaps")
	public void enter_the_password_for_vmmaps() {
	    sendKeys(p.getPassword(),"Suriya@123");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}
	
	@And("Enter the confirm password")
	public void enter_the_confirm_password() {
	   sendKeys(p.getConfirmpassword(),"Suriya@123");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@And("Click the privacy policy")
	public void click_the_privacy_policy() {
	   click(p.getClick());
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(15));
	}

	@Then("Click register button")
	public void click_register_button() {
	    click(p.getRegisterbutton());
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
}
	



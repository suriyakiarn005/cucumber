package com.stepdefinition;

import java.time.Duration;

import com.Baseclass.Baseclass;

import com.pom.Pom2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class Forgetpassword_stepdefinition extends Baseclass {
Pom2 p2 = new Pom2();
	
	@Given("launch the url")
	public void launch_the_url() {
	    driver.get("https://vmmaps.com/vrs/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@When("Click the sigin button in the page")
	public void click_the_sigin_button_in_the_page() {
	    click(p2.getForgetSignin());
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("Click the forget password")
	public void click_the_forget_password() {
	   click(p2.getForgetpassword());
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("Enter the existing mail address")
	public void enter_the_existing_mail_address() {
	   sendKeys(p2.getForgetpasswordemailaddress(),"suriyakiran005@gmail.com");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("Enter the new passsword")
	public void enter_the_new_passsword() {
	   sendKeys(p2.getChangepassword(),"suriya123");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}

	@And("click login")
	public void click_login() {
	   click(p2.getClickloginbutton());
	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	}
	
}

package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class Pom1 extends Baseclass {

	public Pom1() {
	PageFactory.initElements(driver, this);
	}
@FindBy (id ="Sign-In")
private WebElement Signin;

	@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//input[@title=\"Enter registered Email Id\"]")
	private WebElement emailaddress;
	
	@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//input[@title=\"Enter Password\"]")
	private WebElement password;

@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//span[@class=\"Submit\"][1]")
private WebElement loginbutton;

public WebElement getSignin() {
	return Signin;
}

public void setSignin(WebElement signin) {
	Signin = signin;
}

public WebElement getEmailaddress() {
	return emailaddress;
}

public void setEmailaddress(WebElement emailaddress) {
	this.emailaddress = emailaddress;
}

public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

public void setLoginbutton(WebElement loginbutton) {
	this.loginbutton = loginbutton;
}
}
package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class Pom extends Baseclass {
	public Pom() {
		PageFactory.initElements(driver,this);
		}
@FindBy(xpath="//div[@class=\"Rectangle-4922\"]")
private WebElement signup;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@name=\"signupName\"]")
private WebElement fullname;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@title=\"Enter Your Email Id\"]")
private WebElement emailaddress;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@type=\"number\"]")
private WebElement mobilenumber;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@title=\"Enter Password\"]")
private WebElement password;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@title=\"Enter Confirm Password\"]")
private WebElement confirmpassword;

@FindBy(xpath = "//div[@class=\"signup-content\"]//input[@type=\"checkbox\"]")
private WebElement click;

@FindBy(xpath = "//div[@class=\"signup-content\"]//button[@class=\"Rectangle-8953\"]")
private WebElement registerbutton;

public WebElement getFullname() {
	return fullname;
}
public void setFullname(WebElement fullname) {
	this.fullname = fullname;
}
public WebElement getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(WebElement emailaddress) {
	this.emailaddress = emailaddress;
}
public WebElement getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(WebElement mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(WebElement confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public WebElement getClick() {
	return click;
}
public void setClick(WebElement click) {
	this.click = click;
}
public WebElement getRegisterbutton() {
	return registerbutton;
}
public void setRegisterbutton(WebElement registerbutton) {
	this.registerbutton = registerbutton;
}
public WebElement getSignup() {
	return signup;
}
public void setSignup(WebElement signup) {
	this.signup = signup;
}

}

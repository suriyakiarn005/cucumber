package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class Pom2 extends Baseclass {

	public Pom2() {
		PageFactory.initElements(driver, this);
		}
	@FindBy (id ="Sign-In")
	private WebElement forgetSignin;
	
	@FindBy(xpath ="//span[@class=\"Forgot-Password\"]")
	private WebElement forgetpassword;
	
	public WebElement getForgetpassword() {
		return forgetpassword;
	}

	public void setForgetpassword(WebElement forgetpassword) {
		this.forgetpassword = forgetpassword;
	}
	@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//input[@title=\"Enter registered Email Id\"]")
	private WebElement forgetpasswordemailaddress;
	
	@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//input[@title=\"Enter Password\"]")
	private WebElement changepassword;

@FindBy(xpath="//div[@class=\"Rectangle-8917\"]//span[@class=\"Submit\"][1]")
private WebElement clickloginbutton;

public WebElement getForgetSignin() {
	return forgetSignin;
}

public void setForgetSignin(WebElement forgetSignin) {
	this.forgetSignin = forgetSignin;
}

public WebElement getForgetpasswordemailaddress() {
	return forgetpasswordemailaddress;
}

public void setForgetpasswordemailaddress(WebElement forgetpasswordemailaddress) {
	this.forgetpasswordemailaddress = forgetpasswordemailaddress;
}

public WebElement getChangepassword() {
	return changepassword;
}

public void setChangepassword(WebElement changepassword) {
	this.changepassword = changepassword;
}

public WebElement getClickloginbutton() {
	return clickloginbutton;
}

public void setClickloginbutton(WebElement clickloginbutton) {
	this.clickloginbutton = clickloginbutton;
}


}

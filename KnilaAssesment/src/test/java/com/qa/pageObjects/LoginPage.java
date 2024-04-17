package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.BaseClass;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class LoginPage extends BaseClass {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//input[@id='loginButton']")
	WebElement loginElement;

	public void userNameField(String name) {
		userName.sendKeys(name);

	}

	public void userPassword() {
		password.sendKeys(userPassword);

	}

	public void loginButton() {
		loginElement.click();
		

	}

}

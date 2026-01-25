package com.maccron.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath = "//button[text()='Log-In / Sign-Up']" )
		private WebElement loginButton;
		
		@FindBy(name = "email")
		private WebElement EmailTextField;
		
		@FindBy(name = "password")
		private WebElement PasswordTextField;
		
		@FindBy(xpath = "//button[text()='Log In With Email']")
		private WebElement SubmitButton;

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getEmailTextField() {
			return EmailTextField;
		}

		public WebElement getPasswordTextField() {
			return PasswordTextField;
		}

		public WebElement getSubmitButton() {
			return SubmitButton;
		}
		
}

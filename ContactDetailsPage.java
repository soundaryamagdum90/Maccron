package com.maccron.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage {
	public  ContactDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//label[text()='Contact Detail']" )
	private WebElement contactDetails;
	
	@FindBy(xpath="//span[text()='Update']")
	private WebElement updateButton;



	public WebElement getContactDetails() {
		return contactDetails;
	}



	public WebElement getUpdateButton() {
		return updateButton;
	}
	
	
}

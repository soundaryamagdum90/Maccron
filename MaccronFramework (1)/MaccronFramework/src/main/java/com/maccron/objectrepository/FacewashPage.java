package com.maccron.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacewashPage {
	public  FacewashPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Face Clear Perfect Cleansing Foam']")
	private WebElement FacewashPage;

	public WebElement getFacewashPage() {
		return FacewashPage;
	}

}

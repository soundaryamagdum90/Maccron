package com.maccron.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	public  CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Skin Care']")
	private WebElement SkincareButton;
	
	@FindBy(xpath="//button[text()='Facial Care']")
	private WebElement FacialcareButton;
	
	@FindBy(xpath="//span[text()='DewDrop Evenness Boost Korean Rice Water Serum']")
	private WebElement ProductPage;

	public WebElement getSkincareButton() {
		return SkincareButton;
	}

	public WebElement getFacialcareButton() {
		return FacialcareButton;
	}

	public WebElement getProductPage() {
		return ProductPage;
	}
	
	
}

	

	
	
	
	
	

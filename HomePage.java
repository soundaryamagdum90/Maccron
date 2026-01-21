package com.maccron.objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='MuiButton-startIcon MuiButton-iconSizeMedium css-1l6c7y9']")
	private WebElement CategoryButton;
	
	@FindBy(xpath = "(//button[text()='Skin Care'])[1]")
	private WebElement SkinCareButton;
	
	@FindBy(xpath = "(//button[text()='Brand'])[1]")
	private WebElement BrandButton;
	
	@FindBy(xpath = "(//div[@class='icon-wrapper']/button)[1]")
	private WebElement SerachButton;
	
	@FindBy(xpath = "(//button[contains(@class,'MuiIconButton-root')])[2]")
	private WebElement UserIcon;
	
	@FindBy(xpath = "(//span[@class='MuiTouchRipple-root css-w0pj6f'])[1]")
	private WebElement LikeIcon;
	
	@FindBy(xpath = "//label[text()='Log Out']")
	private WebElement LogoutButton;
	
	
	
	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	@FindBy(name = "q")
	private WebElement searchTextField;
	
	@FindBy(xpath="//span[text()='Eye Creams & Eye ']")
	private WebElement FirstProduct;
	
	@FindBy(xpath = "//div[@class='search-result-item-text-content']")
	private List<WebElement> autosuggestion;
	
	@FindBy(xpath="//p[text()='Sorry, no items found for your request']")
	private WebElement InvalidMessage;
	
	@FindBy(xpath="//label[text()='Change Password']")
	private WebElement ChangePassword;
	
	@FindBy(xpath="//span[text()='Change Password']")
	private WebElement BlankPasswordButton;
	
	@FindBy(xpath="//span[text()='Password incorrect']")
	private WebElement ChangedPassword;
	
	public WebElement getChangedPassword() {
		return ChangedPassword;
	}

	public WebElement getBlankPasswordButton() {
		return BlankPasswordButton;
	}

	public WebElement getChangePassword() {
		return ChangePassword;
	}

	public WebElement getInvalidMessage() {
		return InvalidMessage;
	}

	public WebElement getFirstProduct() {
		return FirstProduct;
	}

	public List<WebElement> getAutosuggestion() {
		return autosuggestion;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getCategoryButton() {
		return CategoryButton;
	}

	public WebElement getSkinCareButton() {
		return SkinCareButton;
	}

	public WebElement getBrandButton() {
		return BrandButton;
	}

	public WebElement getSerachButton() {
		return SerachButton;
	}

	public WebElement getUserIcon() {
		return UserIcon;
	}

	public WebElement getLikeIcon() {
		return LikeIcon;
	}
	
}

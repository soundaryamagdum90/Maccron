package maccronProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.maccron.BaseClass.BaseClass;
import com.maccron.generic.fileutilities.PropertiesUtilities;
import com.maccron.generic.webdriverutilities.WebDriverUtilities;
import com.maccron.objectrepository.ContactDetailsPage;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class BlankPasswordTextFieldTest extends BaseClass{
	@Test(groups = {"regreesion"})
	
	

	public void blankPasswordTextField() throws IOException, InterruptedException {
		

		
		
		HomePage homepage = new HomePage(driver);
		//wait.until(ExpectedConditions.elementToBeClickable(homepage.getUserIcon()));
		WebDriverUtilities web = new WebDriverUtilities();
		web.safeFindAndClick(homepage.getUserIcon(),driver).click();
		//homepage.getUserIcon().click();
		
		
		//Thread.sleep(3000);
		web.safeFindAndClick(homepage.getUserIcon(),driver).click();
		//ContactDetailsPage contact = new ContactDetailsPage(driver);
		//homepage.getUserIcon().click();
		homepage.getChangePassword().click();
		homepage.getBlankPasswordButton().click();
		WebElement change = homepage.getChangedPassword();
		System.out.println(change.getText());
		//HomePage hp = new HomePage(driver);
//		hp.getUserIcon().click();
//		hp.getLogoutButton().click();
//		
//		driver.quit();
	

	}

}

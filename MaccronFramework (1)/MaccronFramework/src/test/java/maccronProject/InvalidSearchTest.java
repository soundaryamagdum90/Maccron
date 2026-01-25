package maccronProject;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.maccron.BaseClass.BaseClass;
import com.maccron.generic.fileutilities.PropertiesUtilities;
import com.maccron.generic.webdriverutilities.WebDriverUtilities;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class InvalidSearchTest extends BaseClass {
	@Test(groups = {"regreesion"})

	public void invalidSearch() throws IOException {
		
		
		HomePage hp = new HomePage(driver);
		WebDriverUtilities wdu = new WebDriverUtilities();
		
		hp.getSerachButton().click();
		hp.getSearchTextField().sendKeys("@#$%%^^",Keys.ENTER);
		WebElement invalid = hp.getInvalidMessage();
		System.out.println(invalid.getText());
		
		Date d = new Date();
		String date = d.toString().replaceAll(" ", "").replaceAll(":","");
		wdu.toTakeScreenshotsas(driver,"./screenshots/negative" + date + ".png");

		
		//hp.getUserIcon().click();
		//hp.getLogoutButton().click();
		
		
	
		
	}

}

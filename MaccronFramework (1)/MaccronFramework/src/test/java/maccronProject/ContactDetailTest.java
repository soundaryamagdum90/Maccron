package maccronProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.maccron.BaseClass.BaseClass;
import com.maccron.generic.fileutilities.PropertiesUtilities;
import com.maccron.generic.webdriverutilities.WebDriverUtilities;
import com.maccron.objectrepository.ContactDetailsPage;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class ContactDetailTest extends BaseClass{
	@Test(groups = {"smoke"})

	public void contactDetails() throws IOException, InterruptedException {
		

		HomePage homepage = new HomePage(driver);
		//ContactDetailsPage contact = new ContactDetailsPage(driver);
		WebDriverUtilities web = new WebDriverUtilities();
		web.safeFindAndClick(homepage.getUserIcon(),driver).click();
		web.safeFindAndClick(homepage.getUserIcon(),driver).click();
		//homepage.getUserIcon().click();
		
		
	
		ContactDetailsPage contact = new ContactDetailsPage(driver);
		//homepage.getUserIcon().click();
		contact.getContactDetails().click();
		contact.getUpdateButton().click();
		
		
			}

		


	}



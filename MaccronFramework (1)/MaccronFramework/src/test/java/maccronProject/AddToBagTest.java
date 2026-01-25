package maccronProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.maccron.BaseClass.BaseClass;
import com.maccron.generic.fileutilities.PropertiesUtilities;
import com.maccron.objectrepository.FacewashPage;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class AddToBagTest extends BaseClass{
	@Test(groups = {"smoke"})
	
	public void addToBag()  throws IOException {
		
		
		
		
		
		HomePage hp = new HomePage(driver);
		hp.getSerachButton().click();
		hp.getSearchTextField().sendKeys("Facewash",Keys.ENTER);
		
		FacewashPage facewash = new FacewashPage(driver);
		facewash.getFacewashPage().click();
		
	//	hp.getUserIcon().click();
		//hp.getLogoutButton().click();
		
		//driver.quit();
		
		

	}

}

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
import com.maccron.objectrepository.CategoryPage;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class CategoriesTest extends BaseClass {
	@Test(groups = {"smoke"})

	public void categories() throws IOException, InterruptedException {
		
	
		
		
		HomePage hp = new HomePage(driver);
		hp.getCategoryButton().click();
		//Thread.sleep(4000);
		
		CategoryPage cat = new CategoryPage(driver);
		cat.getSkincareButton().click();
		cat.getFacialcareButton().click();
		cat.getProductPage().click();
		
		//hp.getUserIcon().click();
	//	hp.getLogoutButton().click();
		
		
		
		


		
		
	

	}

}

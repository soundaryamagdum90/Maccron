package maccronProject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
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

public class AutoSuggestionsTest extends BaseClass {
@Test(groups = {"smoke"})
	public void autoSuggestions() throws IOException {


			HomePage hp = new HomePage(driver);
			hp.getSerachButton().click();
			hp.getSearchTextField().sendKeys("serum");
			List<WebElement> auto = hp.getAutosuggestion();
			for (WebElement a : auto) {
				System.out.println(a.getText());
			}
			//WebDriverUtilities web = new WebDriverUtilities();
			//web.safeFindAndClick(hp.getUserIcon(),driver);
			//driver.findElement(By.xpath("(//button[contains(@class,'MuiIconButton-root')])[2]"));
			
			//driver.quit();
			
			
			
}

}

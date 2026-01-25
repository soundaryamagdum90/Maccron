package com.maccron.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.maccron.generic.fileutilities.PropertiesUtilities;
import com.maccron.objectrepository.HomePage;
import com.maccron.objectrepository.LoginPage;

public class BaseClass {
		
public static  WebDriver driver;
	
	public static WebDriver sdriver;
	PropertiesUtilities pu = new PropertiesUtilities();

	@BeforeSuite(groups = {"smoke","regreesion"})
	public void baseSuite() {
		Reporter.log("connect to DataBase", true);
	}

	@BeforeTest(groups = {"smoke","regreesion"})
	public void beforeTest() {
		Reporter.log("pre conditions", true);
	}


	@BeforeClass(groups = {"smoke","regreesion"})
	public void beforeClass() throws IOException {
		String BROWSER = pu.readTheDataFromPropertiesFile("browser");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge"))
			driver = new EdgeDriver();
		else if (BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
		sdriver=driver;
	}

	@BeforeMethod(groups = {"smoke","regreesion"})
	public void beforeMethod() throws IOException {
		String URL = pu.readTheDataFromPropertiesFile("url");
		String EMAIL = pu.readTheDataFromPropertiesFile("email");
		String PASSWORD = pu.readTheDataFromPropertiesFile("password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		HomePage hp= new HomePage(driver);
		hp.getUserIcon().click();
		LoginPage login = new LoginPage(driver);
		login.getLoginButton().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(EMAIL);
		lp.getPasswordTextField().sendKeys(PASSWORD);
		lp.getSubmitButton().click();
	}

	@AfterMethod(groups = {"smoke","regreesion"})
	public void afterMethod() {
		HomePage hp = new HomePage(driver);
		hp.getUserIcon().click();
		hp.getLogoutButton().click();
	}

	@AfterClass(groups = {"smoke","regreesion"})
	public void afterClass() {
		driver.quit();
	}
}

		




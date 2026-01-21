package com.maccron.generic.webdriverutilities;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	//Actions Class
	public WebDriver mousehoverAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		return driver;
	}
	
	
	public WebElement safeFindAndClick(WebElement we, WebDriver driver) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

	    for (int i = 0; i < 3; i++) {
	        try {
	            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(we));
	            el.click();
	            return el;
	        } catch (StaleElementReferenceException e) {
	            System.out.println("Stale detected, retrying..." + (i+1));
	        }
	    }

	    throw new RuntimeException("Element remained stale after retries: " + we);
	}
	//SelectClass
	public void selectDropDoenByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	
	
	//WebDriver Wait
	public void checkElementToBeClickable(WebDriver driver, WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(we));

	}

	public WebElement checkVisibilityof(WebDriver driver, WebElement element, long sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.visibilityOf(element));

	}
	public WebElement checkVisibilityofElementLocated(WebDriver driver, WebElement element, long sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));

	}
	
	
	
	
	
	//JavaScriptExecutor
	public void scrollWebPage(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");

	}

	
	//WindowHandles
	public void generateWindowHandleMethod(WebDriver driver) {
		Set<String> allId = driver.getWindowHandles();
		for (String string : allId) {
			driver.switchTo().window(string);
		}
	}
		public void ececutescriptmethod(WebDriver driver,WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);

}
		public void toTakeScreenshotsas(WebDriver driver,String path) throws IOException  {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			 FileHandler.copy(src,des);
			
			 
		}
}
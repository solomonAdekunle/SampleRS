package Pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.BaseTest;


public class BasePage {
 //WebDriver driver;

protected WebDriver driver;
Properties OR=BaseTest.OR;
Properties CONFIG=BaseTest.CONFIG;

   /* Initialised the webdriver in */
	public BasePage(WebDriver driver) {
		this.driver = driver;

	}

	/* Creating a Click Method */
	public void click(String identifier) {
		try {

			if (identifier.endsWith("_xpath"))
				driver.findElement(By.xpath(OR.getProperty(identifier))).click();
			else if (identifier.endsWith("_id"))
				driver.findElement(By.id(OR.getProperty(identifier))).click();
			else if (identifier.endsWith("_name"))
				driver.findElement(By.name(OR.getProperty(identifier))).click();
			else if ((identifier.endsWith("_Selector"))) {
				driver.findElement(By.cssSelector(OR.getProperty(identifier))).click();
			}
		} catch (Exception e) {
			//Utility.takeScreenShot(identifier);
			Assert.fail("Element not found - " + identifier + e.getMessage());

		}
	}

	/* Creating a clear Method */
	public void clear(String identifier) {
		try {
			if (identifier.endsWith("_xpath"))
				driver.findElement(By.xpath(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_id"))
				driver.findElement(By.id(OR.getProperty(identifier))).clear();
			else if (identifier.endsWith("_name"))
				driver.findElement(By.name(OR.getProperty(identifier))).clear();
			else if ((identifier.endsWith("_Selector")))
				driver.findElement(By.cssSelector(OR.getProperty(identifier))).clear();
		} catch (Exception e) {
			//Utility.takeScreenShot(identifier);// take screenshot
			Assert.fail("Element not found - " + identifier + e.getMessage());

		}
	}

	/* Creating a send key methond */
	public void input(String identifier, String data) {
		try {
			if (identifier.endsWith("_xpath"))
				driver.findElement(By.xpath(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_id"))
				driver.findElement(By.id(OR.getProperty(identifier))).sendKeys(data);
			else if (identifier.endsWith("_name"))
				driver.findElement(By.name(OR.getProperty(identifier))).sendKeys(data);
			else if ((identifier.endsWith("_Selector")))
				driver.findElement(By.cssSelector(OR.getProperty(identifier))).sendKeys(data);
		} catch (Exception e) {
			Assert.fail("Element not found - " + identifier + e.getMessage());
			//Utility.takeScreenShot(identifier);
		}
	}

	/* Creating Title Verification Method */
	public boolean verifyTitle(String expectedTitleKey) {
		String expectedTitle = OR.getProperty(expectedTitleKey);
		String actualTitle = driver.getTitle();
		// Utility.takeScreenshot(expectedTitleKey);
		if (expectedTitle.equals(actualTitle))
			return true;
		else
			return false;
	}

	/* Creating is Element Present method */
	public boolean isElementPresent(String identifier) {
		int size = 0;
		if (identifier.endsWith("_xpath"))
			size = driver.findElements(By.xpath(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_id"))
			size = driver.findElements(By.id(OR.getProperty(identifier))).size();
		else if (identifier.endsWith("_name"))
			size = driver.findElements(By.name(OR.getProperty(identifier))).size();
		else if ((identifier.endsWith("_Selector")))
			size = driver.findElements(By.cssSelector(OR.getProperty(identifier))).size();
		else // not in prop file
			size = driver.findElements(By.xpath(identifier)).size();
		//Utility.takeScreenShot(identifier);
		if (size > 0)
			return true;
		else
			return false;
	}

	/* Creating get Text Method */
	public String getText(String identifier) {
		String text = "";
		if (identifier.endsWith("_xpath"))
			text = driver.findElement(By.xpath(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_id"))
			text = driver.findElement(By.id(OR.getProperty(identifier))).getText();
		else if (identifier.endsWith("_name"))
			text = driver.findElement(By.name(OR.getProperty(identifier))).getText();
		else if ((identifier.endsWith("_Selector")))
			text = driver.findElement(By.cssSelector(OR.getProperty(identifier))).getText();
		//Utility.takeScreenShot(identifier);
		return text;

	}

	/* Creating Find Element by cssSelector */
	public WebElement getObjectFromSelector(String Selector) {
		try {
			return driver.findElement(By.cssSelector(OR.getProperty(Selector)));

		} catch (Throwable t) {
			

			return null;
		}

	}
	/* Verify if user is on the site */
	 public boolean isUserOnPage(){
		 this.clickWelcomeYourFeedBackPop();
		 boolean RSLogo=isElementPresent("RSlogo_Selector");
		 return RSLogo;
	 }

   public void clickWelcomeYourFeedBackPop(){
   try{ 
		WebElement FeedBackMessage = driver.findElement(By.cssSelector("div.acsClassicInner a[title='No, thanks']"));
		if (FeedBackMessage.isDisplayed()==true)
			FeedBackMessage.click();
   } catch (Exception e){
	   e.getMessage();
   }
}
}

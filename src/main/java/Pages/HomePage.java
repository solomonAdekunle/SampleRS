package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.BaseTest;

public class HomePage extends BasePage{
	
	
//	Properties OR=BaseTest.OR;
//	Properties CONFIG=BaseTest.CONFIG;
	
	
	//initialised
	public HomePage(WebDriver driver){
		super(driver);
		
	}
	
	public void getHomeUrl(String baseUrl){
		driver.get(baseUrl + "/"); 
	}

	
	/* Click on All Product Link */
	public void clickAllProductMenuLink() {
		click("AllProucts_Selector");

	}
	/* Click on Cable and Wire witnin the all Product Menu */
	public void clickAllProductCableAndWireLink() {
		WebElement AllProductMenuOver = driver
				.findElement(By.cssSelector(OR.getProperty("ProductMenuOverLay_Selector")));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AllProductMenuOver));
			click("AllProductor_CableAndWire_Selector");
	}
}

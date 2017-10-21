package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CableAndWirePage extends BasePage {

	
	public CableAndWirePage(WebDriver driver) {
		super(driver);
		
	}
	/* Navigate to Cable Wire Home Page */
	 public void get(String baseURL){
		 this.driver.get(baseURL + "/c/cables-wires/");
	 }
     /* Verify if Cable And Wire is displayed as title */ 
	 public boolean isCableWireTilePresent(){
		 boolean TitlePage=isElementPresent("ProductsCategoryTitlePage_Selector");
		 return TitlePage;
	 }
	 /* Click on Choose your Connection link on the page */
	 public void clickChooseYourConnectionlink(){
//		 WebDriverWait wait= new WebDriverWait(driver,20);
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("cableAndwire_ChooseYourConnection_Selector")));
//		 click("cableAndwire_ChooseYourConnection_Selector");
		 WebElement ChooseYourConnector = driver.findElement(By.cssSelector(OR.getProperty("cableAndwire_ChooseYourConnection_Selector")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", ChooseYourConnector);
	 }
}

package com.Suite.RS2;

import java.util.Properties;

import org.junit.Assert;

import Pages.CableAndWirePage;
import Pages.IndustriaPowerConnectorPage;
import TestBase.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCableAndWire {
	Properties CONFIG=BaseTest.CONFIG;
	private StepDefBase baseContent;
	private CableAndWirePage cwPage;
	private IndustriaPowerConnectorPage PicPage;
	
	
	public StepDefCableAndWire(StepDefBase baseContent){
		this.baseContent=baseContent;
		System.out.println(this.baseContent);
		cwPage= new CableAndWirePage(baseContent.getwebdriver());
		PicPage= new IndustriaPowerConnectorPage(baseContent.getwebdriver());
	}
	/* Go to Cable and Wire Page */
	@Given("^I Navigated to Cable and Wire Page on \"([^\"]*)\"$")
	public void i_Navigated_to_Cable_and_Wire_Page_on(String baseURL)  {
		cwPage.get(CONFIG.getProperty("siteName"));
	    
	}
	/* Go To Power and Industrial Page */
	@Given("^I am on Power Industrial Connector Page$")
	public void i_am_on_Power_Industrial_Connector_Page()  {
		
	    
	}
	
	
	
	
	/* Click on Choose your own Connector link */
	@When("^I click on Choose your own Connector link$")
	public void i_click_on_Choose_your_own_Connector_link()  {
		cwPage.clickChooseYourConnectionlink();
	    
	}

		

	@When("^I click on Add button on PIC Product table$")
	public void i_click_on_Add_button_on_PIC_Product_table() {
	    
	}
	
	
	@Then("^I should Navigate to IndustrialPower Connector Page$")
	public void i_should_Navigate_to_IndustrialPower_Connector_Page() {
		Assert.assertTrue(PicPage.isIndustrialPowerConnectorTitlePagePresent());
	   
	}


	@Then("^I should see my Product added$")
	public void i_should_see_my_Product_added() {
	    
	}



}

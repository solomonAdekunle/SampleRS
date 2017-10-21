package com.Suite.RS2;

import java.util.Properties;

import org.junit.Assert;

import Pages.BasePage;
import Pages.CableAndWirePage;
import Pages.HomePage;
import TestBase.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefHomePage {
	Properties CONFIG=BaseTest.CONFIG;
	private StepDefBase baseContent;
	private HomePage  homePage;
	private BasePage basePage;
	private CableAndWirePage cwPage;
	
	
	public StepDefHomePage(StepDefBase baseContent){
		this.baseContent=baseContent;
		System.out.println(this.baseContent);
		homePage = new HomePage(baseContent.getwebdriver());
		basePage= new BasePage(baseContent.getwebdriver());
		cwPage= new CableAndWirePage(baseContent.getwebdriver());
		
	}
	@Given("^I Navigate to the Home Page on \"([^\"]*)\"$")
	public void i_Navigate_to_the_Home_Page_on(String baseUrl)  {
		homePage.getHomeUrl(CONFIG.getProperty("siteName"));
	    
	}

	@When("^I click on all Product menu$")
	public void i_click_on_all_Product_menu()  {
		homePage.clickAllProductMenuLink();
	    
	}

	@When("^I click on Cable Wire link$")
	public void i_click_on_Cable_Wire_link()  {
		homePage.clickAllProductCableAndWireLink();
	   
	}

	@Then("^I Should see Cable wire Page$")
	public void i_Should_see_Cable_wire_Page()  {
		Assert.assertTrue(cwPage.isCableWireTilePresent());
		
		
		
	    
	}


}

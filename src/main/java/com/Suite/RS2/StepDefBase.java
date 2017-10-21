package com.Suite.RS2;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import TestBase.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefBase extends BaseTest{
	Properties CONFIG=BaseTest.CONFIG;
	
	private static boolean isInitialised=false;
	
	@Before
	public void setup(){
		if(!isInitialised){
			this.creatDriver();
			isInitialised=true;
		}
	}
		@After("@web")
		public void Teardown(Scenario s) throws Throwable{
			this.tidyUp(s);
			isInitialised = false;
		}
		
		
		
		public WebDriver getwebdriver(){
			return driver;
			
		}
	}
	
	



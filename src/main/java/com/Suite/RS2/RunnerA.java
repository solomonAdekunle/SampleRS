package com.Suite.RS2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

features = {"src\\main\\resources\\com\\Features\\"},glue = { "com.Suite.RS2/" },

plugin = {"pretty",

"html:target/cucumber-html-report",

"junit:target/cucumber-junit-report/allcukes.xml"},

tags = {"@Runme", "~@ignore"}

)

public class RunnerA  {

}

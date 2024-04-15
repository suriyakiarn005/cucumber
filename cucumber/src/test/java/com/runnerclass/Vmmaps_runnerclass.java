package com.runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.Baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature",glue="com.stepdefinition",
tags= "@vmmaps")
public class Vmmaps_runnerclass extends Baseclass {

	@BeforeClass
	public static void launch() {
		driver = Baseclass.getBrowser("chrome");
	}
	
	
}

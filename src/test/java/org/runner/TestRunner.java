package org.runner;

import org.base.Jvmreport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.step" }, monochrome = true, plugin = {
		"json:src\\test\\resources\\Report\\adactin.json" })
public class TestRunner {

	@AfterClass
	public static void afterCalss() {
		Jvmreport.generatejvmreport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\adactin.json");

	}

}

package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {

	public static void generatejvmreport(String jsonFile) {

		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Report");
		Configuration c = new Configuration(loc, "adactin bookin");
		c.addClassifications("os", "windows name");
		c.addClassifications("browser", "chrome");
		c.addClassifications("version", "79");
		c.addClassifications("sprint", "20");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, c);

		builder.generateReports();

	}

}

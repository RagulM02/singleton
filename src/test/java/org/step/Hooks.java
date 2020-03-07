package org.step;

import org.base.PomBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends PomBase {
	@Before
	public void beforeScenario() {
		browserLaunch();
		LoadUrl("https://adactin.com/HotelApp/");
		max();
	}

	@After
	public void safterscanrio(Scenario sc) {
			if (!sc.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] s = tk.getScreenshotAs(OutputType.BYTES);
		System.out.println(s);
		sc.embed(s, "image/png");
		quitBrowser();
		
		}
	}

}

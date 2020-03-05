package org.pom;

import org.base.PomBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancelpom extends PomBase {
	public Cancelpom() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
	
	
}

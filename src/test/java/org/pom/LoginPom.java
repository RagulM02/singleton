package org.pom;

import org.base.PomBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends PomBase {
	public LoginPom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement name;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement btn;

	public WebElement getName() {
		return name;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getBtn() {
		return btn;
	}

}

package org.pom;

import org.base.PomBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpom extends PomBase {

	public Searchpom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement Numberofroom;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement child;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement cnte;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCnte() {
		return cnte;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return Numberofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

}

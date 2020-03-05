package org.pom;

import org.base.PomBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Detailspom extends PomBase {
	
	public Detailspom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement Fname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement Lname;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement add;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement crdnum;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement crdtype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement mon;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderno;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookitin;
	
	
	
	public WebElement getBookitin() {
		return bookitin;
	}
	public WebElement getFname() {
		return Fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCrdnum() {
		return crdnum;
	}
	public WebElement getCrdtype() {
		return crdtype;
	}
	public WebElement getMon() {
		return mon;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	
	
}

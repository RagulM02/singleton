package org.step;

import org.base.PomBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Cancelpom;
import org.pom.Detailspom;
import org.pom.LoginPom;
import org.pom.Searchpom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactpomStep extends PomBase {

	@Given("user in adactin home page")
	public void user_in_adactin_home_page() {
		browserLaunch();
		LoadUrl("https://adactin.com/HotelApp/");
		max();

	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {
		LoginPom l = new LoginPom();
		fill(l.getName(), s1);
		fill(l.getPwd(), s2);
		click(l.getBtn());

	}

	@When("user fill  the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_fill_the(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
		Searchpom s = new Searchpom();
		fill(s.getLocation(), r1);
		fill(s.getHotel(), r2);
		fill(s.getRoomtype(), r3);
		fill(s.getNumberofroom(), r4);
		fill(s.getCheckin(), r5);
		fill(s.getCheckout(), r6);
		fill(s.getAdult(), r7);
		fill(s.getChild(), r8);
		click(s.getSubmit());
		click(s.getRadio());
		click(s.getCnte());

	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the(String S1, String S2, String S3, String S4, String S5, String S6, String S7, String S8)
			throws InterruptedException {
		Detailspom d = new Detailspom();
		fill(d.getFname(), S1);
		fill(d.getLname(), S2);
		fill(d.getAdd(), S3);
		fill(d.getCrdnum(), S4);
		Select(d.getCrdtype(), S5);
		Select(d.getMon(), S6);
		Select(d.getYear(), S7);
		fill(d.getCvv(), S8);
		click(d.getBooknow());
		Thread.sleep(5000);
		Att(d.getOrderno());

		String orderid = Att(d.getOrderno());
		
		click(d.getBookitin());
		
		String xpath = "//input[@value='" + orderid + "']/parent::td/preceding-sibling::td";
		WebElement data = driver.findElement(By.xpath(xpath));
		click(data);
		
		Cancelpom c = new Cancelpom();
		click(c.getCancel());
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@Then("user get the order number")
	public void user_get_the_order_number() throws InterruptedException {

		quitBrowser();
	}

}

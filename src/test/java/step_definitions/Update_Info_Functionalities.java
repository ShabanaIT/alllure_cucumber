package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Update_Info_Functionalities extends Base{
	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		navigateURL("https://it.microtechlimited.com/index.html");
		String s=getText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
		assertEquals("Welcome to MicroTech NA.",s);
	}

	@When("I Click on Login")
	public void i_Click_on_Login() {
		 click(By.xpath("//ul//li[4]"));
	}

	@Then("I will be in Login Page")
	public void i_will_be_in_Login_Page() {
		String empLogin=getText(By.xpath("//div/h1"));
	    assertEquals("Employee Login",empLogin);
	}

	@Then("Click Customer Login")
	public void click_Customer_Login() {
	   click(By.xpath("//ul//li[2]"));
	}

	@Then("I enter User Id")
	public void i_enter_User_Id() {
	   sendkeys(By.xpath("//input[@name=\"mailuid\"]"),"David@gmail.com");
	}

	@Then("I enter Password")
	public void i_enter_Password() {
	    sendkeys(By.name("pwd"),"1234");
	}

	@When("I click Login Button")
	public void i_click_Login_Button() {
	    click(By.name("login-submit"));
	}

	@Then("I will see Customer Home Page")
	public void i_will_see_Customer_Home_Page() {
	   String s= getText(By.xpath("//h2[text()=\"Welcome David\"]"));
	   assertEquals("Welcome David",s);
	}

	@Then("I will click Order Product")
	public void i_will_click_Order_Product() {
	    click(By.xpath("//ul//li[3]"));
	}

	@Then("I select product")
	public void i_select_product() {
	    click(By.xpath("//select[@name=\"prodId\"]"));
	   
	}

	@Then("I click a Product")
	public void i_click_a_Product() {
		 click(By.xpath("//option[@value='2']"));
	}

	@Then("I enter order date")
	public void i_enter_order_date() {
	   sendkeys(By.name("ordDate"),"02/02/22"); 
	}

	@Then("I click order Product button")
	public void i_click_order_Product_button() {
		click(By.xpath("//button[@type='submit']"));
	}

	@Then("I will see {string} home Page")
	public void i_will_see_home_Page(String string) {
	    String s=getText(By.id("orderList-title"));
	    assertEquals("Order List",s);
	}

	@Then("I click confirm button")
	public void i_click_confirm_button() {
	    click(By.xpath("//a[@href='orderSubmit.php?ordId=122&id=4']"));
	}

	@Then("refresh Url")
	public void refresh_Url() {
		browser.navigate().refresh();
	}

	@Then("I will see {string} status")
	public void i_will_see_status(String string) {
	   String s= getText(By.xpath("//tr[19]//td[text()=\"Confirmed\"]"));
	   System.out.println("----------------------"+s);
	   assertEquals("Confirmed",s);
	}



}

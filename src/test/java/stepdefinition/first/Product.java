package stepdefinition.first;

import UIpages.Homepage;
import UIpages.Product2;
import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Product extends TestBase {
	
	public Homepage page;
	public Product2 prod;
	

	public Product(){
		
	super();	
		
	}
	
	
	@Before
	
	
public void before(){
		
	init();	
	
	page=new Homepage();
		
	}
	
	
	@Given("^I have an chrome browser opened$")
	public void i_have_an_chrome_browser_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^i open the url of the page on the browser$")
	public void i_open_the_url_of_the_page_on_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^page shhould be displayed$")
	public void page_shhould_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
prod=page.search();
prod.mobilesearch();


	    
	}

	

}

package UIpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.second.Mobileproduct;
import base.TestBase;

public class Homepage extends TestBase {
	
	
	@FindBy(xpath="//input[contains(@name,'q')]")WebElement home;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")WebElement sub;
	
	
	
	public Homepage(){
		
		PageFactory.initElements(dr, this);
	}
	

	public Product2 search(){
		
		home.sendKeys("mobiles");
		sub.click();
		return new Product2();
		
	}
	
	
}

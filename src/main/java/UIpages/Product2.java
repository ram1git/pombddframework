package UIpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Product2 extends TestBase{
	
	
	@FindBy(xpath="//div[contains(text(),'Redmi Note 6 Pro (Black, 64')]")WebElement phone;
	
	
	
	
	
	public Product2(){
		
		
		PageFactory.initElements(dr, this);
	}
	
	
	
	public void mobilesearch(){
		
		phone.click();
		
	}
	

}

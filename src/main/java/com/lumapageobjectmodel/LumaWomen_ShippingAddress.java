package com.lumapageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_class;
import com.lumainterface.LumaWomen;
import com.propertyfile.FileReader;

public class LumaWomen_ShippingAddress extends Base_class implements LumaWomen{
	@FindBy(xpath = address_xpath )
	private WebElement address ;
	
	@FindBy(xpath= city_xpath)
	private WebElement city;
	
	@FindBy(xpath= country_xpath)
	private WebElement country;
	
	@FindBy(xpath = state_xpath)
	private WebElement state ;
	
	@FindBy(xpath = phoneno_xpath)
	private WebElement phoneno ;
	
	@FindBy(xpath = postalcode_xpath)
	private WebElement postalcode ;
	
	//constructor 
		public  LumaWomen_ShippingAddress(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	
		 public void getcheckoutpage () throws InterruptedException {
			  FileReader reader = new FileReader();
			  getUrl(reader.getPropertyFileData("url"));
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		 }
}

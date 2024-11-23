package com.lumapageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_class;
import com.lumainterface.LumaWomen;
import com.propertyfile.FileReader;

public class LumaWomenLoginPage extends Base_class implements LumaWomen {
	@FindBy(xpath = signin_xpath )
	private WebElement signin ;
	
	@FindBy(name = username_name)
	private WebElement username;
	
	@FindBy(xpath = password_xpath)
	private WebElement password;
	
	@FindBy(xpath = login_xpath)
	private WebElement login ;
	
	
	
	//constructor 
	public LumaWomenLoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	 public void getLoginPage () {
		  FileReader reader = new FileReader();
		  getUrl(reader.getPropertyFileData("url"));
		  clickElement(signin);
		 passInput(username,reader.getPropertyFileData("loginusername"));
		 passInput(password, reader.getPropertyFileData("loginpassword"));
		// implicitWait(5);
		 clickElement(login);
	 }
	
	
}

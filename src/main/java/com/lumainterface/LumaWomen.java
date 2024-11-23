package com.lumainterface;

public interface LumaWomen {
	//login page
String signin_xpath = "//div[@class='panel header']//a[normalize-space()='Sign In']";
String username_name = "login[username]";
String password_xpath = "//input[@name='login[password]']";
String login_xpath = "//fieldset[@class='fieldset login']//button[@id='send2']";

// addtocart
String women_xpath =  "(//span [@class=\"ui-menu-icon ui-icon ui-icon-carat-1-e\"])[1]";
//String tops_xpath = "(//span[contains(text(),'Tops')])[1]";
String tops_css = "#ui-id-9";
//String jackets_xpath = "//a[@id='ui-id-19']//span[contains(text(),'Jackets')]";
String jackets_css ="#ui-id-11";
//String size_xpath = "//div[text()='Size']";
//String large_xpath = "//a[@aria-label='L']//div[contains(@class,'swatch-option text')][normalize-space()='L']";
//String color_xpath = "//div[text()='Color']";
//String purple_xpath = "//a[@aria-label='Purple']//div[contains(@class,'swatch-option color')]";
//String junojacket_xpath = "/a[normalize-space()='Juno Jacket']";
String junojacket_xpath="//a[normalize-space()='Juno Jacket']";
String  addtocart_xpath = "//button[@id='product-addtocart-button']";
String size_xpath = "//div[@aria-label='L']";
String color_xpath = "//div[@aria-label='Purple']";
String showcart2_xpath = "//a[@class='action showcart']";
String checkout_xpath = "//button[text()='Proceed to Checkout']";

// address page

String  address_xpath ="//input[@name='street[0]']";
String  city_xpath = "//input[@id='FW8P42T']";
String  country_xpath= "//select[@id='DMG9CD7']";
String  state_xpath= " //select[@id='MHJYR98']";
String   phoneno_xpath= "//input[@name='telephone']";
String  postalcode_xpath = "//input[@name='postcode']";

String  next_xpath = "//*[text()='Next']";


}

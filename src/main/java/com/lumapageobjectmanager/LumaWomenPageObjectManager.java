package com.lumapageobjectmanager;

import com.baseclass.Base_class;
import com.lumapageobjectmodel.LumaWomenLoginPage;
import com.lumapageobjectmodel.LumaWomen_CheckOut;
import com.lumapageobjectmodel.LumaWomen_ShippingAddress;
import com.pageObjectModel.OpenMrsLoginPage;
import com.propertyfile.FileReader;

public class LumaWomenPageObjectManager extends Base_class {
private LumaWomenLoginPage loginpage ;
private FileReader reader;
private LumaWomen_CheckOut checkout;
private LumaWomen_ShippingAddress  address;
public LumaWomenLoginPage getLoginpage() {
	if (loginpage == null) {
		loginpage = new  LumaWomenLoginPage (driver);
	}
	return loginpage;
}
public FileReader getReader() {
	if (reader == null) {
		reader = new  FileReader();
	}
	return reader;
}
public LumaWomen_CheckOut getCheckout() {
	if (checkout == null) {
		checkout = new LumaWomen_CheckOut (driver);
	}
	
	return checkout;
}
public LumaWomen_ShippingAddress getAddress() {
	if (address == null) {
		address = new LumaWomen_ShippingAddress (driver);
	}
	
	
	return address;
}





}

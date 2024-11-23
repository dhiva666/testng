package LumaRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Base_class;
import com.lumainterface.LumaWomen;
import com.lumapageobjectmanager.LumaWomenPageObjectManager;

public class LumaWomenRunner extends Base_class implements LumaWomen {

	LumaWomenPageObjectManager pageobjectmanager = new LumaWomenPageObjectManager ();
	@BeforeTest
	public void setUp () {
		browserLaunch(pageobjectmanager.getReader().getPropertyFileData("browser"));
		
	}
	@Test(priority=1)
	public void lumawomen_loginpage () {
		pageobjectmanager.getLoginpage().getLoginPage();
	}  
	
	
	@Test(priority=2)
	
	public void checkout () throws InterruptedException {
		pageobjectmanager.getCheckout().getcheckoutpage();
	}
}

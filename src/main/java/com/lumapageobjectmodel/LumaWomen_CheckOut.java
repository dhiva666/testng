package com.lumapageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_class;
import com.lumainterface.LumaWomen;
import com.propertyfile.FileReader;

public class LumaWomen_CheckOut extends Base_class implements LumaWomen {
	@FindBy(xpath = women_xpath )
	private WebElement women ;
	
	@FindBy(css = tops_css)
	private WebElement tops;
	
	@FindBy(css = jackets_css)
	private WebElement jackets;
	
	@FindBy(xpath = size_xpath)
	private WebElement size ;
	
	@FindBy(xpath = junojacket_xpath)
	private WebElement junojacket ;
	
	@FindBy(xpath = color_xpath)
	private WebElement color ;
	
	
	@FindBy(xpath = addtocart_xpath)
	private WebElement addtocart ;
	
	@FindBy(xpath = showcart2_xpath)
	private WebElement  showcart1 ;
	
	@FindBy(xpath = checkout_xpath)
	private WebElement  checkout ;
	//constructor 
	public LumaWomen_CheckOut (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	 public void getcheckoutpage () throws InterruptedException {
		  FileReader reader = new FileReader();
		  getUrl(reader.getPropertyFileData("url"));
		  mouseHover(women);
		 // Thread.sleep(4000);
		  mouseHover(tops);
		  clickElement(jackets);
		// implicitWait(5);
		  clickElement(junojacket);
		 // Thread.sleep(5000);
		 // javaScriptExecutorClick(junojacket);
		  //explicitWaitforclicable(junojacket,5);
		 // explicitWaitforclicable(addtocart,5);
		  Thread.sleep(3000);
		 clickElement(size);
		
		 clickElement(color);
		 Thread.sleep(4000);
		 
		 clickElement(addtocart);
		//explicitWaitforclicable(addtocart,5);
		 //Thread.sleep(4000);
		//javaScriptExecutorClick(addtocart);
		 Thread.sleep(3000);
		 clickElement(showcart1);
		 clickElement(checkout);
		 
	 }
}

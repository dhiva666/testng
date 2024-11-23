package com.baseclass;




	import java.awt.Desktop;
	import java.io.File;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	import org.junit.Assert;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	//import dev.failsafe.internal.util.Assert;

	public abstract class Base_class {

		public static WebDriver driver;
		
	    public static ExtentReports extentReports;
	    public static File file;
	    
		protected static WebDriver browserLaunch(String browserName) {
			try {
			if(browserName.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("edge")) {
					driver= new EdgeDriver();
				}else if (browserName.equalsIgnoreCase("firefox")) {
					driver= new FirefoxDriver();
			}
			
			}
			catch(Exception e) {
				Assert.fail("Error--browserLaunch");
			}
			driver.manage().window().maximize();
			return driver;
		}
		
		protected static WebDriver closeBrowser() {
			try {
				driver.close();
			}
			catch(Exception e) {
				Assert.fail("ERROR--CLOSEBROWSER");
			}
			return driver;
		}
		
		protected static WebDriver terminateBrowser() {
			try {
				driver.quit();
			}
			catch(Exception e) {
				Assert.fail("ERROR--TERMINATEBROWSER");
			}
			return driver;
		}
		
		protected static void navigationPage(String url) {
			try {
				driver.navigate().to("url");
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();
			}
			catch(Exception e) {
				Assert.fail("ERROR--NAVIGATIONPAGE");
			}
		}
		
		protected static void getUrl(String url) {
			try {
				driver.get(url);
			}
			catch(Exception e) {
				Assert.fail("ERROR--CANT GET INTO URL");
			}
		}
		
		protected static void acceptAlert(WebElement element){
			try {
				element.click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				alert.dismiss();
				
						}
			catch(Exception e) {
				Assert.fail("ERROR--FAILED TO CREATE ALERT");
			}
		}
		protected static void dismissAlert(WebElement element){
			try {
				element.click();
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
				
						}
			catch(Exception e) {
				Assert.fail("ERROR--FAILED TO CREATE ALERT");
			}
		}
		
		protected static void mouseHover(WebElement element) {
			try {
				Actions action = new Actions (driver);
				action.moveToElement(element);
			    action.build().perform();
			}
			catch(Exception e) {
				Assert.fail("ERROR--MOUSE ACTIONS ARE NOT PERFORMED");
			}
			
		}
		
		protected static void mouseRightclick(WebElement element) {
			try {
				Actions action = new Actions (driver);
				action.contextClick(element);
			    action.build().perform();
			}
			catch(Exception e) {
				Assert.fail("ERROR--MOUSE ACTIONS ARE NOT PERFORMED");
			}
			
		}
		
		protected static void mouseDoubleclick(WebElement element) {
			try {
				Actions action = new Actions (driver);
				action.doubleClick(element);
			    action.build().perform();
			}
			catch(Exception e) {
				Assert.fail("ERROR--MOUSE ACTIONS ARE NOT PERFORMED");
			}
			
		}
		
		protected static void mouseDraganddrop(WebElement element1,WebElement element2) {
			try {
				Actions action = new Actions (driver);
				action.dragAndDrop(element1,element2);
			    action.build().perform();
			}
			catch(Exception e) {
				Assert.fail("ERROR--MOUSE ACTIONS ARE NOT PERFORMED");
			}
			
		}
		
		protected static void frames(WebElement element) {
			try {
				driver.switchTo().frame(element);
			}
			catch(Exception e) {
				Assert.fail("ERROR---FRAME ELEMENT NOT FOUND");
			}
			
		}
		 
		protected static void isEnabled(WebElement element) {
			try {
				element.isEnabled();
				System.out.println("Element IS ENABLED");
				
			}
			catch(Exception e) {
				Assert.fail("ERROR--ELEMENT NOT ENABLED");
			}
			
		}
		
		protected static void isDisplayed(WebElement element) {
			try {
				element.isDisplayed();
				System.out.println("ELEMENT IS DISPLAYED");
			}
			catch(Exception e) {
				Assert.fail("ERROR--ELEMENT NOT DISPLAYED");
			}
			
		}
		protected static void isSelected(WebElement element1) {
			try {
				element1.isSelected();
				System.out.println("ERROR:ELEMENT IS SELECTED");
			}
			catch(Exception e) {
				Assert.fail("ERROR--ELEMENT IS NOT SELECTED");
			}
			
		}
		protected static WebDriver title(String url) {
			try {
				driver.getTitle();
			}
			catch(Exception e) {
				Assert.fail("ERROR--TITLE IS NOT AVAILABLE");
			}
			return driver;
		}
		
		protected static WebDriver currenturl(String url) {
			try {
				driver.getCurrentUrl();
			}
			catch(Exception e) {
				Assert.fail("ERROR--current url is not found");
			}
			return driver;
		}
		protected static void implicitWait(long seconds) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			}
			catch(Exception e) {
				Assert.fail("ERROR--IMPLICIT WAIT");
			}
		}
		
		protected static void explicitWait(WebElement element,long seconds) {
			try {
				WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(seconds));
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e) {
				Assert.fail("ERROR--EXPLICIT WAIT");
			}
		}
		
		protected static void explicitWaitforclicable(WebElement element,long seconds) {
			try {
				WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(seconds));
				wait.until(ExpectedConditions.elementToBeClickable(element));
			}
			catch(Exception e) {
				Assert.fail("ERROR--EXPLICIT  WAIT FOR ELEMENT TO BE CLICABLE");
			}
		}
		
		
		protected static void dropDownByValue(WebElement element,String value) {
			try {
				Select  select = new Select(element);
				select.selectByValue(value);
				
			}
			catch(Exception e) {
				Assert.fail("ERROR--DROPDOWNBYVALUE");
			}
		}
		
		protected static void dropDownByText(WebElement element,String text) {
			try {
				Select  select = new Select(element);
				select.selectByVisibleText(text);
				
			}
			catch(Exception e) {
				Assert.fail("ERROR--DROPDOWNBYTEXT");
			}
		}
		
		protected static void dropDownByIndex(WebElement element,int index) {
			try {
				Select  select = new Select(element);
				select.selectByIndex(index);
				
			}
			catch(Exception e) {
				Assert.fail("ERROR--DROPDOWNBYindex");
			}
		}
		
		
		 protected static void validate (String actual,String expected) {
			 try {
				 Assert.assertEquals( actual,expected);
			 } catch (Exception e) {
				 Assert.fail("ERROR: OCCURS DURING VALIDATION");
			 }
		 }
		
		
			protected static void screenShot(String filepath) { 
				try {
					 TakesScreenshot shot = (TakesScreenshot) driver;
					    File source = shot.getScreenshotAs(OutputType.FILE);
					    File dest = new File (filepath);
					    FileHandler.copy(source, dest);
					    System.out.println("scrrenshot taken");
				}
				catch(Exception e) {
					Assert.fail("ERROR--SCREENSHOT NOT TAKEN");
				}
				
			}
			
			protected static void passInput(WebElement element,String input) {
				try {
					element.sendKeys(input);	
				}
				catch(Exception e) {
					Assert.fail("ERROR--INPUT VALUE NOT ENTERED");
				}
			}
				
				protected static void screenShot1(String filepath)  { 
					try {
						 TakesScreenshot shot = (TakesScreenshot) driver;
						    File source = shot.getScreenshotAs(OutputType.FILE);
						    File dest = new File (filepath);
						    FileHandler.copy(source, dest);
						    System.out.println("scrrenshot taken");
					}
					catch(Exception e) {
						Assert.fail("ERROR--SCREENSHOT NOT TAKEN");
					}
					
				}
			
			
			protected static void clickElement(WebElement element) {
				try {
					element.click();	
				}
				catch(Exception e) {
					Assert.fail("ERROR--NOT CLICKED");
				}
			}
			
			protected static void javaScriptExecutorClick(WebElement element) {
				try {
					JavascriptExecutor  javascript = (JavascriptExecutor) driver;
					javascript.executeScript("argument[0].click;",element);
				}
				catch(Exception e) {
					Assert.fail("ERROR--NOT CLICKED");
				}
			}
			
			public static void extentReportStart(String location) {
				extentReports = new ExtentReports();
				file = new File(location);
				ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
				extentReports.attachReporter(sparkReporter);
			}
			
			public static void extentReportTearDown(String location) throws IOException {
				extentReports.flush();
				file = new File(location);
				Desktop.getDesktop().browse((file).toURI());
			}
				
			protected static String takeScreenShot() throws IOException { 
				try {
					 TakesScreenshot screenshot = (TakesScreenshot) driver;
					 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
					    File source = screenshot.getScreenshotAs(OutputType.FILE);
					    File dest = new File ("Screenshot\\.png" + "_" + timeStamp + ".png");
					    FileUtils.copyFile(source, dest);
					    return dest.getAbsolutePath();
				}
				catch(Exception e) {
					Assert.fail("ERROR--SCREENSHOT NOT TAKEN");
				}
				return null;
				
			}
				
				
			
	}




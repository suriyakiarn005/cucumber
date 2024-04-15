package com.virtual_maze_cucumber;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	
	public static WebDriver driver ;
	public static WebDriver getBrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome"))
		{ 
			WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");	
		driver=new ChromeDriver(options);}
		
//		else if (browser.equalsIgnoreCase("edge")) {
//			System.setProperty("webdriver.edge.driver",
//					System.getProperty("user.dir")+("\\driver\\msedgedriver.exe"));
//		driver=new EdgeDriver();
//		}
		driver.manage().window().maximize();
	return driver;
		}

	//=================sendkeys======================\\
	public static void sendKeys(WebElement element,String value) {
	element.sendKeys(value);
	}
	//====================click=======================//
	public static void click(WebElement element) {
		element.click();
		
	}

	//==========================geturl================//
	public static void geturl(String url) {
	driver.get(url);

	}
	//===================threadsleep===================//

	public void sleep() throws Throwable{
		Thread.sleep(3000);

	}

	public static void back() {
		driver.navigate().back();
	}
	public  static void forward() {
		driver.navigate().forward();
	}
	public  static void refresh() {
		driver.navigate().refresh();
	}
	//=========================Alert============================
	public  static void alertacccept() {
	driver.switchTo().alert().accept();
	}
	public  static void alertdismiss() {
	driver.switchTo().alert().dismiss();
	}
	public  static void alerttext(String value) {
		driver.switchTo().alert().sendKeys(value);
	driver.switchTo().alert().accept();
	}
	//==========================Actions===============
	public static void contextClick(WebElement element) {
	Actions Ac=new Actions(driver);
	Ac.contextClick().perform();
	}
	public static void MovetoElement(WebElement element) {
		Actions Ac=new Actions(driver);
	Ac.moveToElement(element).perform();
	}
	public static void doubleclick(WebElement element) {
	Actions ac=new Actions(driver);
	ac.doubleClick().perform();
	}
	//=================Windowshandle=========================
//	public static void windowshandle(WebElement element) throws Throwable {
//
//		String parent = driver.getWindowHandle();
//
//		Set<String> all_Id = driver.getWindowHandles();
		//Iterator<String> iterator = all_Id.iterator();
//
//		while (iterator.hasNext()) {
//			String child = iterator.next();
//		driver.switchTo().window(child);
//		Thread.sleep(2000);
//
//		}
//
//		driver.switchTo().window(parent);
//
//	}
	//====================frame=====================
	public static void Frames(WebElement element) throws Throwable {
		WebElement frameconcept= driver.findElement (By.name("SingleFrame"));
		driver.switchTo().frame(frameconcept);

		WebElement findElement = driver.findElement(By.xpath("//input [@type=\"text\"]"));
		findElement.sendKeys("sk");
		Thread.sleep(2000);
		 
		driver.switchTo().parentFrame();

		WebElement Secondframe= driver.findElement (By.xpath("(//a[@class=\"analystic\"])[2]"));
		Secondframe.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		 
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		findElement2.sendKeys("Hi");
	}
	//==============================Screenshot============================
//		public static void screenshot() {
//			TakesScreenshot ts=(TakesScreenshot)driver;{
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			File destinate=new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Screenshot");
//			try {
//				FileUtils.copyFileToDirectory(source, destinate);
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			}
//			}
	//======================================Robot==============================
		public static void Keypress()throws Exception{
			Robot Rt=new Robot();
			Rt.keyPress(KeyEvent.VK_TAB);
			Rt.keyPress(KeyEvent.VK_DOWN);
			Rt.keyPress(KeyEvent.VK_ENTER);	
		
		
		
		
		}
	//=======================draganddrop=========================
		public static void draganddrop(WebElement element) {
		WebElement Bank = driver.findElement (By.xpath("(//a [@class=\"button button-orange\"])[5]"));
		
		WebElement Acount= driver.findElement( By.xpath("(//h3 [@align=\"center\"])[2]"));

		Actions ac1 = new Actions (driver);
		ac1.dragAndDrop(Bank,Acount).perform();
		
	}
	//================================scrollupanddown===================	
		public static void scrollupanddown(WebElement element) throws Throwable {
			WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Australia']"));
			WebElement scrollup = driver.findElement(By.xpath("(//span [@class='a-color-base'])[2]"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",scrollup);
			Thread.sleep(9000);
			
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].scrollIntoView();",scrolldown);
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,-700)");
			Thread.sleep(2000);
		}
			
			//==============================Drop down=================
			
		
		
		
			public static void selectbyindex( WebElement element,int value) {
				Select S = new Select(element);
				S.selectByIndex(value);
			}
			public static void selectbyvalue( WebElement element,String value) {
				Select S = new Select(element);
			S.selectByValue(value);
			}
			public static void selectbyvisibletext (WebElement element ,String value) {
				Select S = new Select(element);
			S.selectByVisibleText(value);
			}
		}






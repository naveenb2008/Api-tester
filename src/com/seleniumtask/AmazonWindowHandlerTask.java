package com.seleniumtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AmazonWindowHandlerTask {
 static	WebDriver driver;	
 static	Actions a;
 static Robot r;
 static List<String> li;
  static TakesScreenshot t;
	private static void browser_launch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=14402484085338169215&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061930&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	driver.manage().window().maximize();
	}
	
	private static void actions() throws AWTException {
    a= new Actions(driver);

}

	private static void amazonminitab() throws AWTException, InterruptedException {
		Thread.sleep(4000);
		WebElement AmazonminiTv = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		a.moveToElement(AmazonminiTv).contextClick().build().perform();
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	private static void selltab() throws AWTException, InterruptedException {
		Thread.sleep(4000);
	WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
	a.moveToElement(sell).contextClick().build().perform();
	r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	}
	private static void mobiletab() throws AWTException, InterruptedException {
		Thread.sleep(4000);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.moveToElement(mobiles).contextClick().build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	private static void windowswitch() throws InterruptedException {
 li= new ArrayList<String>(driver.getWindowHandles());
 Thread.sleep(4000);
 driver.switchTo().window(li.get(3));
 System.out.println(li.get(3));

 System.out.println(li.get(2));
 System.out.println(li.get(1));

 System.out.println(li.get(0));
 Thread.sleep(4000);
 driver.switchTo().window(li.get(2));
 Thread.sleep(4000);
 driver.switchTo().window(li.get(1));
 Thread.sleep(4000);
 driver.switchTo().window(li.get(0));
 
 driver.switchTo().window(li.get(3));
	}
	
	private static void screenshot() throws IOException {
 t =(TakesScreenshot)driver;
 File screenshotAs = t.getScreenshotAs(OutputType.FILE);
 File file = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\amazontask.png");
 FileHandler.copy(screenshotAs, file);
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		browser_launch();
		actions();
		amazonminitab();
		selltab();
		mobiletab();
		windowswitch();
		screenshot();
	}

}

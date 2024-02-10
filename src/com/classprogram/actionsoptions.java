package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsoptions {
static	WebDriver driver;
 static  Actions act;

	private static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      driver.manage().window().maximize();
	}
	
	private static void clickelement() {
WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
findElement.sendKeys("ASdfgvbzxc");
 act =new Actions(driver);
act.doubleClick(findElement).build().perform();

	}
	private static void rightclick() {
WebElement contextclick = driver.findElement(By.xpath("//input[@name='pass']"));
contextclick.sendKeys("asdfgsadfasd");
act.contextClick(contextclick).build().perform();;
	}
	private static void doubleclick() {
driver.get("https://www.instagram.com/");
WebElement doubleclick = driver.findElement(By.xpath("//input[@maxlength='75']"));
doubleclick.sendKeys("sfzdbxbx");
act =new Actions(driver);

act.doubleClick(doubleclick).build().perform();
	}
	
	public static void main(String[] args) {
		browserlaunch();
		clickelement();
		//rightclick();
		//doubleclick();
		
	}

}

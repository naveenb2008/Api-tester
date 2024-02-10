package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("naveenprabu");
		driver.findElement(By.cssSelector(" #pass")).sendKeys("asdfgasdfg");
	driver.findElement(By.cssSelector("[name='login']")).click();
	
	driver.navigate().to("https://www.instagram.com/");
	
	driver.findElement(By.cssSelector("[aria-label^='Phone number']")).sendKeys("naveen_prabu");
	driver.findElement(By.cssSelector("[type$= 'password']")).sendKeys("asdfghj");
	driver.findElement(By.cssSelector("[type= 'submit']")).click();
	
	}

}

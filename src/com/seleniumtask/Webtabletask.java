package com.seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Webtabletask {
	static WebDriver driver;
	private static void browerlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://cosmocode.io/automation-practice-webtable/");
driver.manage().window().maximize();

	}
	private static void particulardata() {
String text = driver.findElement(By.xpath("//table/tbody/tr[61]/td[3]")).getText();
System.out.println(text);
System.out.println("==========================================================");
List<WebElement> jamaicadata = driver.findElements(By.xpath("//table/tbody/tr[85]/td"));

	for (int i = 0; i < jamaicadata.size(); i++) {
		System.out.println(jamaicadata.get(i).getText());
	}
	System.out.println("==========================================================");
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[132]/td[4]")).getText());
	System.out.println("==========================================================");
List<WebElement> languages = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
	for (WebElement x : languages) {
		System.out.println(x.getText());
		
	}
	System.out.println("==========================================================");
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr[197]/td[2]")).getText());
	}
	
	

public static void main(String[] args) {
	browerlaunch();
	particulardata();
}
}

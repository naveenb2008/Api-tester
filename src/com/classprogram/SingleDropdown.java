package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
static WebDriver driver;
private static  void browserLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	

}
private static void singledropdown() {
WebElement animal = driver.findElement(By.xpath("//select[@id='first']"));
Select s =new Select(animal);
s.selectByIndex(1);
s.selectByValue("Google");
s.selectByVisibleText("Iphone");

}
private static void animaldropdown() {
WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
Select s =new Select(animals);
//s.selectByIndex(3);
s.selectByValue("Cat");
s.selectByVisibleText("Avatar");
}
public static void main(String[] args) {
	browserLaunch();
	singledropdown();
	animaldropdown();
}
}

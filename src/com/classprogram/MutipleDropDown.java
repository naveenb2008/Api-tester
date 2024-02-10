package com.classprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutipleDropDown {

	static WebDriver driver;
	private static void browserlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
driver.manage().window().maximize();
	}
	
	private static void multipledropdown() {
		WebElement food = driver.findElement(By.xpath("//select[@multiple='true']"));

		Select s = new Select(food);
		System.out.println(s.isMultiple());
		s.selectByValue("burger");
		s.selectByVisibleText("bonda");
	System.out.println("========selected products========");	
	List<WebElement> options = s.getOptions();
	for (WebElement selected: options) {
		System.out.println(selected.getText());
		
	}
	System.out.println("======== first selected products========");	
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());

	}
	public static void main(String[] args) {
		browserlaunch();
		multipledropdown();
	}
}

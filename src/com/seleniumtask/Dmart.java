package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.indiaglitz.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.swiggy.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("http://www.zomato.com/chennai/order-food-online/");
		driver.close();
	}
}

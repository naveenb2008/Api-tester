package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioMart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jiomart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://ticketnew.com/movies/chennai");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.get("https://in.bookmyshow.com/");
		driver.get("https://www.myntra.com/");
		driver.navigate().back();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.navigate().to("https://www.dmartindia.com/");
		driver.navigate().back();
		driver.close();
	}
}

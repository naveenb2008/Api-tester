package com.classprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.navigate().to("http://www.instagram.com/");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().to("http://www.amazon.in/");
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.get("http://www.flipkart.com/");

	}
}

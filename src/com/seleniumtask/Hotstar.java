package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.navigate().to("http://www.hotstar.com/");
		Thread.sleep(2000);

		driver.get("http://www.myntra.com/");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().to("http://www.dmartindia.com/");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.get("http://ticketnew.com/movies/chennai");
		Thread.sleep(2000);

		driver.get("http://in.bookmyshow.com/");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

		driver.close();
	}

}

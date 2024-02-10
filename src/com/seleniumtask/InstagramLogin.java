package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void loginpage() {
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.findElement(By.name("username")).sendKeys("naveenbala.b6@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@naveenB6");

	}

	public static void main(String[] args) {
		browserLaunch();
		loginpage();
	}

}

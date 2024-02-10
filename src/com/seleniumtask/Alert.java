package com.seleniumtask;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	static WebDriver driver;

	private static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}

	private static void simplealert() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-danger'] ")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

	private static void confirm_Alert() throws InterruptedException {

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();

	}

	private static void prompt_Alert() {
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys("nabeedf");
		alert.accept();
	}

	private static void screenshot() throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\alert.png");
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		browserlaunch();
		simplealert();
		confirm_Alert();
		prompt_Alert();
		screenshot();

	}

}

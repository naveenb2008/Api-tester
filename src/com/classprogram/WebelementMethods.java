package com.classprogram;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {
	static WebDriver driver;

	private static void browserlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();

	}
private static void url_launch() {
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
//set size
Dimension d= new Dimension(1090, 1000);
driver.manage().window().setSize(d);


//set position
Point p =new Point(500, 250);
driver.manage().window().setPosition(p);



}
private static void login_page() {
WebElement username = driver.findElement(By.id( "email"));
username.sendKeys("qwertty");
//username.clear();

WebElement password = driver.findElement(By.name("pass"));
password.sendKeys("naveen");

WebElement login = driver.findElement(By.name("login"));
login.click();
}

public static void main(String[] args) {
	browserlaunch();
	url_launch();
	login_page();
	
	
	
}

	
}

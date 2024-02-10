package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {
	 static WebDriver driver;
private static void firstWindowid() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
  driver =new ChromeDriver();
  driver.manage().window().maximize();
}

private static void urllaunch() {
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

}
private static void firstWindowHandle() {
      System.out.println(driver.getWindowHandle());
      driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
}
private static void allwindowId() {
	
     System.out.println(driver.getWindowHandles());
}
public static void main(String[] args) {
	firstWindowid();
	urllaunch();
	firstWindowid();
	firstWindowHandle();
	allwindowId();
}
}

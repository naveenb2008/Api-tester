package com.classprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
static WebDriver driver;
private static void browser_launch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
}

private static void urlLaunch() {
driver.get("https://letcode.in/frame");
driver.manage().window().maximize();
}
private static void frame() {
driver.switchTo().frame(0);
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("sfksdkvm,fv");
}

private static void innerframe() throws InterruptedException {
	Thread.sleep(5500);
WebElement element = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
driver.switchTo().frame(element);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("@gmail.com");

}
private static void parentframe() {
driver.switchTo().parentFrame();
driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("askvmdaszdmx,fc");
}
private static void mainpage() {
driver.switchTo().defaultContent();
WebElement findElement = driver.findElement(By.xpath("//h1[text()=' Frame']"));
System.out.println(findElement.getText());
driver.findElement(By.xpath("(//img[@alt='letcode'])[1]")).click();

}

public static void main(String[] args) throws InterruptedException {
	 browser_launch();
	 urlLaunch();
	 frame();
	 innerframe();
	 parentframe();
	 mainpage();
}
}

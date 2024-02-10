package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyLoginTask {
	static WebDriver driver;

	private static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get(
//				"https://www.google.com/search?q=spotify&oq=spo&gs_lcrp=EgZjaHJvbWUqDQgBEAAYgwEYsQMYgAQyBggAEEUYOTINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIKCAMQABixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDIKCAYQABixAxiABDINCAcQABiDARixAxiABDIKCAgQABixAxiABDINCAkQABiDARixAxiABNIBCTY0MTlqMGoxNagCALACAA&sourceid=chrome&ie=UTF-8");
//		;
//		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[4]/td/div/div/div/div/h3/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/div[2]/button[2]/span")).click();
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/ul/li[1]/button")).click();
//	}

//	private static void loginpage() {
//		driver.findElement(By.id("login-username")).sendKeys("naveenbala411@gmail.com"
//		driver.findElement(By.id("icon")).sendKeys("123456");
//		driver.findElement(By.className("ButtonInner")).click();
//
//	}
		
		driver.get("http:/www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");//  syntax-//Tagname[@atributename='AtributeValue'];
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	public static void main(String[] args) {
		browserlaunch();
	//	loginpage();
	}

}

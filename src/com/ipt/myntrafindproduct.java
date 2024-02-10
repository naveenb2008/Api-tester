package com.ipt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.classprogram.BrowserLaunch;

public class myntrafindproduct {
	static WebDriver driver;
	private static void browserlaunch() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize();

 //driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
 driver.get("https://www.google.com/search?q=myntra&oq=myntra&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgcIARAAGI8CMgYIAhBFGDwyBggDEEUYPDIGCAQQRRg8MgYIBRBFGDzSAQk4Mzg1ajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8");
Thread.sleep(1000);
	}
private static void searchcontent() {
driver.findElement(By.xpath("(//h3[contains(text(),'Myntra: Online Shopping ')])[1]")).click();
driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kids",Keys.ENTER);
}

private  static void pricelist() {

	List<Integer> allprice = new ArrayList<>();
	
List<WebElement> allproductsprice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

for (WebElement totalproductsprice : allproductsprice) {
	String pricetext = totalproductsprice.getText();
	String priceonly = pricetext.replace("Rs. ","");
	int priceint = Integer.parseInt(priceonly);
	// System.out.println(priceint);
	
	allprice.add(priceint);
	
	}
    Integer minprice = Collections.min(allprice);
    System.out.println("The minimum price is :"+minprice);
    


}
 public static void main(String[] args) throws Exception {
	browserlaunch();
	searchcontent();
	pricelist();
}
	
}

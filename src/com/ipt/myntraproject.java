package com.ipt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraproject {
	static WebDriver driver;
	static Integer minprice;
	private static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	}
	private static void searchproduct() {
		List<Integer> allprice =new ArrayList<>();
		List<WebElement> allproducts = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
for (WebElement totalproductprice : allproducts) {
	String pricetext = totalproductprice.getText();
	String priceonly = pricetext.replace("Rs. ","");
	Integer priceint = Integer.parseInt(priceonly);
	allprice.add(priceint);
}
Integer minprice = Collections.min(allprice);	
System.out.println(minprice);
productname(minprice);

}
	public static void productname(Integer minprice ) {
		
		WebElement name = driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\" and text()='"+minprice+"']//ancestor::div[@class='product-productMetaInfo']/h3"));
		
		
		System.out.println(name.getText());
		

	}
	
public static void main(String[] args) {
	browserlaunch();
	searchproduct();
	
}
}

package com.classprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	 static WebDriver driver;
	private static void browserlaunch() {
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
      driver =new ChromeDriver();
     driver.get("https://cosmocode.io/automation-practice-webtable/");
driver.manage().window().maximize();
}
private static void alldata() {
 List<WebElement> table = driver.findElements(By.tagName("table"));
int size = table.size();
System.out.println(size);


driver.manage().window().maximize();

}	
private static void totaltable() {
List<WebElement> totaltabledata = driver.findElements(By.xpath("//table/tbody/tr/td"));
System.out.println(totaltabledata.size());
for (WebElement tabletext : totaltabledata) {
	System.out.println(tabletext.getText());
	
}
}
private  static void rowwisedata() {
List<WebElement> rowwisedata = driver.findElements(By.xpath("//table/tbody/tr[23]/td"));
for (int i = 0; i < rowwisedata.size(); i++) {
WebElement rd = rowwisedata.get(i);	
System.out.println(rd.getText());
}
}
private  static void coloumnwisedata() {
List<WebElement> columnwisedsata = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
for (int i = 0; i < columnwisedsata.size(); i++) {
	String text = columnwisedsata.get(i).getText();
	System.out.println(text);
	
}
}
private static void particularrowandcolumn() {
String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
System.out.println(text);
}
public static void main(String[] args) {
	browserlaunch();
	alldata();
	//totaltable();
	//rowwisedata();
	//coloumnwisedata();
	//particularrowandcolumn();
}
	
	

}

package com.classprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreenshot {

 static WebDriver driver;
  static TakesScreenshot t;
 private static void browserlaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver =new ChromeDriver();
driver.get("https://www.netflix.com/in/");
driver.manage().window().maximize();
}
 private static void screenshot() throws IOException {
// lowerdatatype ref =(lowerdatatype) highertype refname;
	 //h.datatype -----------webdriver
	 //l.datatype------------takesscreenshot
	
	 
	 t =(TakesScreenshot) driver;
	 File from = t.getScreenshotAs(OutputType.FILE);
	 File to = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\netflix.png");

	 FileHandler.copy(from, to);
 }
  private static void navigatepage() throws IOException {

	  driver.navigate().to("https://www.primevideo.com/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_gm_16_mkw_symCJqBmk-dc?mrntrk=pcrid_657901934582_slid__pgrid_84577172528_pgeo_1007809_x__adext__ptid_kwd-339065342343");
t= (TakesScreenshot)driver;
File pic1 = t.getScreenshotAs(OutputType.FILE);
File path1 = new File("C:\\Users\\pragadeesh\\eclipse-workspace\\Selenium\\screenshot\\prime.png");
FileUtils.copyFile(pic1, path1);

  }
  public static void main(String[] args) throws IOException {
	 browserlaunch();
	 screenshot();
      navigatepage();
  }
 
}

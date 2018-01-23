package com.minnie.learning.seleniun;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    public static void main(String[] args){
      System.out.println("setting browser");
     // System.setProperty( "webdriver.chrome.driver","C:\\Program Files\\Java\\webdrivers\\chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      driver.manage().window().setSize(new Dimension(480,800));
      driver.get("http://www.baidu.com");
      //driver.quit();
    }
}

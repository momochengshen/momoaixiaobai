package test;

import org.testng.annotations.Test;

import Page.BD;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  //实例化BD
	  BD bdp = new BD(driver);
	  //bdp调用keyword_input元素，调用sendkeys方法
	  bdp.keyword_input.sendKeys("hello");
//	  bdp调用search_button元素，调用click方法
	  bdp.search_button.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/liuxiao/Desktop/KK/chromedriver");
      
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.baidu.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

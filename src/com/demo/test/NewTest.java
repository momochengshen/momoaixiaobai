package com.demo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
 private WebDriver driver;
 
  @Test
  public void f() {
	 By input = By.id("kw");
	 By search = By.id("su");
	 driver.findElement(input).sendKeys("java");
	 driver.findElement(search).click();
	
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.baidu.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

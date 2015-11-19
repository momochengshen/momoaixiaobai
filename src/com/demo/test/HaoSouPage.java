package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HaoSouPage {
//	输入框
	@FindBy(name="q")
	@CacheLookup
	private WebElement hao_keyword;
//	按钮
	@FindBy(id="search-button")
	@CacheLookup
	private WebElement hao_search;
	String url = "http://www.haosou.com/";
	WebDriver driver;
	
	public HaoSouPage(){
		
		 System.setProperty("webdriver.chrome.driver", "/Users/liuxiao/Desktop/KK/chromedriver");
	      
		 driver =new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
//	退出方法
	
	public void close(){
		driver.quit();
	}
	
	//打开url
	public void open(){
		driver.get(url);
	}
//	输入
	public void searchByKeyword(){
		hao_keyword.sendKeys("selenium");
		hao_search.click();
	}
	

}

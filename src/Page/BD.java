package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BD {
	//定义搜索框
 @FindBy(id="kw")
 @CacheLookup
 public WebElement keyword_input;
   //定义搜索按钮
 @FindBy(id="su")
 @CacheLookup
 public WebElement search_button;
 
// 创建一个构造函数
 public BD(WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
 
}

package com.demo.test;

public class Haosoupa { 
	
	public void searchTest(){
//		实例化
		HaoSouPage hsp = new HaoSouPage();
//		使用封装的打开方法
		hsp.open();
//		输入
		hsp.searchByKeyword();
	
		
		
//		关闭
		hsp.close();
		
		
	}
	
	
}

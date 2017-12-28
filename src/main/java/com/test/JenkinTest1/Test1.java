package com.test.JenkinTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver =null;
	@Test
	public void test1(){
		System.out.println("START");
		
		String url =System.getProperty("url");
		System.out.println("------------>>"+url);
		
		String username =System.getProperty("username");
		System.out.println("------------>>"+username);
		
		String environment =System.getProperty("Environment");
		System.out.println("------------>>"+environment);
		
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("END");
	}
}

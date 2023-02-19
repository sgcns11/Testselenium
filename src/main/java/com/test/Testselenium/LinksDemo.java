package com.test.Testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sghosh\\Seleniumdriver\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(); 
	    String appurl= "https://adactinhotelapp.com/";
	    driver.get(appurl);
	    driver.findElement(By.linkText("Forgot Password?")).click();
	    System.out.print(driver.getTitle());

	}

}

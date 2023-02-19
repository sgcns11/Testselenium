package com.test.Testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sghosh\\Seleniumdriver\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(); 
	    String cnsurl= "https://adactinhotelapp.com/";
	    driver.get(cnsurl);
	    driver.findElement(By.partialLinkText("New User Register Here")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("TestTest");
	   // System.out.println(element);   
	
	    driver.findElement(By.id("password")).sendKeys("Test@07");
	    driver.findElement(By.id("re_password")).sendKeys("Test@07");
	    
	    driver.findElement(By.id("full_name")).sendKeys("Test Testy");
	    
	    driver.findElement(By.id("email_add")).sendKeys("Testtesty@dispostable.com");
	    
	    driver.findElement(By.id("captcha-form")).sendKeys("jelbid");
	    driver.findElement(By.id("tnc_box")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("Submit")).click();
	    
	    Thread.sleep(20000);
	    driver.close();

	}

}

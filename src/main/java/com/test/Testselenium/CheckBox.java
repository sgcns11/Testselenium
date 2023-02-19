package com.test.Testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sghosh\\Seleniumdriver\\chromedriver\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver(); 
		    String appurl= "https://adactinhotelapp.com/";
		    driver.get(appurl);
		    driver.findElement(By.partialLinkText("New User")).click();
		    System.out.print(driver.getTitle());
		    Thread.sleep(2000);
		    driver.findElement(By.id("tnc_box")).click();
	}

}
